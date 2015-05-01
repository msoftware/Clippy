package at.droelf.clippy.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.melnykov.fab.FloatingActionButton;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.rengwuxian.materialedittext.validation.METValidator;
import com.zendesk.sdk.feedback.impl.ZendeskFeedbackConnector;
import com.zendesk.sdk.model.CreateRequest;
import com.zendesk.sdk.model.network.ErrorResponse;
import com.zendesk.sdk.network.RequestProvider;
import com.zendesk.sdk.network.impl.ZendeskCallback;
import com.zendesk.sdk.network.impl.ZendeskConfig;
import com.zendesk.sdk.network.impl.ZendeskRequestProvider;

import at.droelf.clippy.HelpActivity;
import at.droelf.clippy.R;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class FeedBackHelpFragment extends Fragment {

    public static FeedBackHelpFragment newInstance(){
        return new FeedBackHelpFragment();
    }

    @InjectView(R.id.help_user_feedback)
    MaterialEditText userFeedBackEditText;

    @InjectView(R.id.help_feedback_progress)
    ProgressBar progressBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_help_feedback, container, false);
        ButterKnife.inject(this, inflate);
        return inflate;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);


        final HelpActivity helpActivity = (HelpActivity) activity;
        final FloatingActionButton fab = helpActivity.getFab();
        fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_action_accept));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean validName = userFeedBackEditText.validateWith(new METValidator("Feedback too short") {
                    @Override
                    public boolean isValid(CharSequence charSequence, boolean b) {
                        return charSequence != null && charSequence.length() > 5;
                    }
                });

                if (validName) {
                    sendComment(userFeedBackEditText.getText().toString());
                    Toast.makeText(getActivity(), "Valid -> next", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    private void setLoading(boolean loading){
        if(loading){
            userFeedBackEditText.setEnabled(false);
            progressBar.setVisibility(View.VISIBLE);
        } else {
            userFeedBackEditText.setEnabled(true);
            progressBar.setVisibility(View.GONE);
        }
    }

    private void sendComment(String feedback){
        setLoading(true);

        final RequestProvider requestProvider = new ZendeskRequestProvider();
        final ZendeskFeedbackConnector zendeskFeedbackConnector = new ZendeskFeedbackConnector(getActivity(), ZendeskConfig.INSTANCE.getContactConfiguration());

        if(zendeskFeedbackConnector.isValid()){
            zendeskFeedbackConnector.sendFeedback(feedback, null, createRequestZendeskCallback);
        }else{
            setLoading(false);
            Toast.makeText(getActivity(), "Failure during submitting comment ;(", Toast.LENGTH_LONG).show();
        }

    }


    private final ZendeskCallback<CreateRequest> createRequestZendeskCallback = new ZendeskCallback<CreateRequest>(){

        @Override
        public void onSuccess(CreateRequest o) {
            Toast.makeText(getActivity(), "Successfully sent ... thanks :)", Toast.LENGTH_LONG).show();
            FeedBackHelpFragment.this.getActivity().finish();
        }

        @Override
        public void onError(ErrorResponse errorResponse) {
            setLoading(false);
            Toast.makeText(getActivity(), "Failure during submitting comment ;(", Toast.LENGTH_LONG).show();
        }
    };
}
