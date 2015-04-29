package at.droelf.clippy.backend.converter.mapping;


import at.droelf.clippy.R;

public class MerlinMapping implements AgentMapping {

    private final static int NUMBER_COLUMNS = 21;
    private final static int NUMBER_ROWS = 21;

    private final static int [] IMAGE_MAPPING = {
            R.drawable.merlin_0000,
            R.drawable.merlin_0001,
            R.drawable.merlin_0002,
            R.drawable.merlin_0003,
            R.drawable.merlin_0004,
            R.drawable.merlin_0005,
            R.drawable.merlin_0006,
            R.drawable.merlin_0007,
            R.drawable.merlin_0008,
            R.drawable.merlin_0009,
            R.drawable.merlin_0010,
            R.drawable.merlin_0011,
            R.drawable.merlin_0012,
            R.drawable.merlin_0013,
            R.drawable.merlin_0014,
            R.drawable.merlin_0015,
            R.drawable.merlin_0016,
            R.drawable.merlin_0017,
            R.drawable.merlin_0018,
            R.drawable.merlin_0019,
            R.drawable.merlin_0020,
            R.drawable.merlin_0021,
            R.drawable.merlin_0022,
            R.drawable.merlin_0023,
            R.drawable.merlin_0024,
            R.drawable.merlin_0025,
            R.drawable.merlin_0026,
            R.drawable.merlin_0027,
            R.drawable.merlin_0028,
            R.drawable.merlin_0029,
            R.drawable.merlin_0030,
            R.drawable.merlin_0031,
            R.drawable.merlin_0032,
            R.drawable.merlin_0033,
            R.drawable.merlin_0034,
            R.drawable.merlin_0035,
            R.drawable.merlin_0036,
            R.drawable.merlin_0037,
            R.drawable.merlin_0038,
            R.drawable.merlin_0039,
            R.drawable.merlin_0040,
            R.drawable.merlin_0041,
            R.drawable.merlin_0042,
            R.drawable.merlin_0043,
            R.drawable.merlin_0044,
            R.drawable.merlin_0045,
            R.drawable.merlin_0046,
            R.drawable.merlin_0047,
            R.drawable.merlin_0048,
            R.drawable.merlin_0049,
            R.drawable.merlin_0050,
            R.drawable.merlin_0051,
            R.drawable.merlin_0052,
            R.drawable.merlin_0053,
            R.drawable.merlin_0054,
            R.drawable.merlin_0055,
            R.drawable.merlin_0056,
            R.drawable.merlin_0057,
            R.drawable.merlin_0058,
            R.drawable.merlin_0059,
            R.drawable.merlin_0060,
            R.drawable.merlin_0061,
            R.drawable.merlin_0062,
            R.drawable.merlin_0063,
            R.drawable.merlin_0064,
            R.drawable.merlin_0065,
            R.drawable.merlin_0066,
            R.drawable.merlin_0067,
            R.drawable.merlin_0068,
            R.drawable.merlin_0069,
            R.drawable.merlin_0070,
            R.drawable.merlin_0071,
            R.drawable.merlin_0072,
            R.drawable.merlin_0073,
            R.drawable.merlin_0074,
            R.drawable.merlin_0075,
            R.drawable.merlin_0076,
            R.drawable.merlin_0077,
            R.drawable.merlin_0078,
            R.drawable.merlin_0079,
            R.drawable.merlin_0080,
            R.drawable.merlin_0081,
            R.drawable.merlin_0082,
            R.drawable.merlin_0083,
            R.drawable.merlin_0084,
            R.drawable.merlin_0085,
            R.drawable.merlin_0086,
            R.drawable.merlin_0087,
            R.drawable.merlin_0088,
            R.drawable.merlin_0089,
            R.drawable.merlin_0090,
            R.drawable.merlin_0091,
            R.drawable.merlin_0092,
            R.drawable.merlin_0093,
            R.drawable.merlin_0094,
            R.drawable.merlin_0095,
            R.drawable.merlin_0096,
            R.drawable.merlin_0097,
            R.drawable.merlin_0098,
            R.drawable.merlin_0099,
            R.drawable.merlin_0100,
            R.drawable.merlin_0101,
            R.drawable.merlin_0102,
            R.drawable.merlin_0103,
            R.drawable.merlin_0104,
            R.drawable.merlin_0105,
            R.drawable.merlin_0106,
            R.drawable.merlin_0107,
            R.drawable.merlin_0108,
            R.drawable.merlin_0109,
            R.drawable.merlin_0110,
            R.drawable.merlin_0111,
            R.drawable.merlin_0112,
            R.drawable.merlin_0113,
            R.drawable.merlin_0114,
            R.drawable.merlin_0115,
            R.drawable.merlin_0116,
            R.drawable.merlin_0117,
            R.drawable.merlin_0118,
            R.drawable.merlin_0119,
            R.drawable.merlin_0120,
            R.drawable.merlin_0121,
            R.drawable.merlin_0122,
            R.drawable.merlin_0123,
            R.drawable.merlin_0124,
            R.drawable.merlin_0125,
            R.drawable.merlin_0126,
            R.drawable.merlin_0127,
            R.drawable.merlin_0128,
            R.drawable.merlin_0129,
            R.drawable.merlin_0130,
            R.drawable.merlin_0131,
            R.drawable.merlin_0132,
            R.drawable.merlin_0133,
            R.drawable.merlin_0134,
            R.drawable.merlin_0135,
            R.drawable.merlin_0136,
            R.drawable.merlin_0137,
            R.drawable.merlin_0138,
            R.drawable.merlin_0139,
            R.drawable.merlin_0140,
            R.drawable.merlin_0141,
            R.drawable.merlin_0142,
            R.drawable.merlin_0143,
            R.drawable.merlin_0144,
            R.drawable.merlin_0145,
            R.drawable.merlin_0146,
            R.drawable.merlin_0147,
            R.drawable.merlin_0148,
            R.drawable.merlin_0149,
            R.drawable.merlin_0150,
            R.drawable.merlin_0151,
            R.drawable.merlin_0152,
            R.drawable.merlin_0153,
            R.drawable.merlin_0154,
            R.drawable.merlin_0155,
            R.drawable.merlin_0156,
            R.drawable.merlin_0157,
            R.drawable.merlin_0158,
            R.drawable.merlin_0159,
            R.drawable.merlin_0160,
            R.drawable.merlin_0161,
            R.drawable.merlin_0162,
            R.drawable.merlin_0163,
            R.drawable.merlin_0164,
            R.drawable.merlin_0165,
            R.drawable.merlin_0166,
            R.drawable.merlin_0167,
            R.drawable.merlin_0168,
            R.drawable.merlin_0169,
            R.drawable.merlin_0170,
            R.drawable.merlin_0171,
            R.drawable.merlin_0172,
            R.drawable.merlin_0173,
            R.drawable.merlin_0174,
            R.drawable.merlin_0175,
            R.drawable.merlin_0176,
            R.drawable.merlin_0177,
            R.drawable.merlin_0178,
            R.drawable.merlin_0179,
            R.drawable.merlin_0180,
            R.drawable.merlin_0181,
            R.drawable.merlin_0182,
            R.drawable.merlin_0183,
            R.drawable.merlin_0184,
            R.drawable.merlin_0185,
            R.drawable.merlin_0186,
            R.drawable.merlin_0187,
            R.drawable.merlin_0188,
            R.drawable.merlin_0189,
            R.drawable.merlin_0190,
            R.drawable.merlin_0191,
            R.drawable.merlin_0192,
            R.drawable.merlin_0193,
            R.drawable.merlin_0194,
            R.drawable.merlin_0195,
            R.drawable.merlin_0196,
            R.drawable.merlin_0197,
            R.drawable.merlin_0198,
            R.drawable.merlin_0199,
            R.drawable.merlin_0200,
            R.drawable.merlin_0201,
            R.drawable.merlin_0202,
            R.drawable.merlin_0203,
            R.drawable.merlin_0204,
            R.drawable.merlin_0205,
            R.drawable.merlin_0206,
            R.drawable.merlin_0207,
            R.drawable.merlin_0208,
            R.drawable.merlin_0209,
            R.drawable.merlin_0210,
            R.drawable.merlin_0211,
            R.drawable.merlin_0212,
            R.drawable.merlin_0213,
            R.drawable.merlin_0214,
            R.drawable.merlin_0215,
            R.drawable.merlin_0216,
            R.drawable.merlin_0217,
            R.drawable.merlin_0218,
            R.drawable.merlin_0219,
            R.drawable.merlin_0220,
            R.drawable.merlin_0221,
            R.drawable.merlin_0222,
            R.drawable.merlin_0223,
            R.drawable.merlin_0224,
            R.drawable.merlin_0225,
            R.drawable.merlin_0226,
            R.drawable.merlin_0227,
            R.drawable.merlin_0228,
            R.drawable.merlin_0229,
            R.drawable.merlin_0230,
            R.drawable.merlin_0231,
            R.drawable.merlin_0232,
            R.drawable.merlin_0233,
            R.drawable.merlin_0234,
            R.drawable.merlin_0235,
            R.drawable.merlin_0236,
            R.drawable.merlin_0237,
            R.drawable.merlin_0238,
            R.drawable.merlin_0239,
            R.drawable.merlin_0240,
            R.drawable.merlin_0241,
            R.drawable.merlin_0242,
            R.drawable.merlin_0243,
            R.drawable.merlin_0244,
            R.drawable.merlin_0245,
            R.drawable.merlin_0246,
            R.drawable.merlin_0247,
            R.drawable.merlin_0248,
            R.drawable.merlin_0249,
            R.drawable.merlin_0250,
            R.drawable.merlin_0251,
            R.drawable.merlin_0252,
            R.drawable.merlin_0253,
            R.drawable.merlin_0254,
            R.drawable.merlin_0255,
            R.drawable.merlin_0256,
            R.drawable.merlin_0257,
            R.drawable.merlin_0258,
            R.drawable.merlin_0259,
            R.drawable.merlin_0260,
            R.drawable.merlin_0261,
            R.drawable.merlin_0262,
            R.drawable.merlin_0263,
            R.drawable.merlin_0264,
            R.drawable.merlin_0265,
            R.drawable.merlin_0266,
            R.drawable.merlin_0267,
            R.drawable.merlin_0268,
            R.drawable.merlin_0269,
            R.drawable.merlin_0270,
            R.drawable.merlin_0271,
            R.drawable.merlin_0272,
            R.drawable.merlin_0273,
            R.drawable.merlin_0274,
            R.drawable.merlin_0275,
            R.drawable.merlin_0276,
            R.drawable.merlin_0277,
            R.drawable.merlin_0278,
            R.drawable.merlin_0279,
            R.drawable.merlin_0280,
            R.drawable.merlin_0281,
            R.drawable.merlin_0282,
            R.drawable.merlin_0283,
            R.drawable.merlin_0284,
            R.drawable.merlin_0285,
            R.drawable.merlin_0286,
            R.drawable.merlin_0287,
            R.drawable.merlin_0288,
            R.drawable.merlin_0289,
            R.drawable.merlin_0290,
            R.drawable.merlin_0291,
            R.drawable.merlin_0292,
            R.drawable.merlin_0293,
            R.drawable.merlin_0294,
            R.drawable.merlin_0295,
            R.drawable.merlin_0296,
            R.drawable.merlin_0297,
            R.drawable.merlin_0298,
            R.drawable.merlin_0299,
            R.drawable.merlin_0300,
            R.drawable.merlin_0301,
            R.drawable.merlin_0302,
            R.drawable.merlin_0303,
            R.drawable.merlin_0304,
            R.drawable.merlin_0305,
            R.drawable.merlin_0306,
            R.drawable.merlin_0307,
            R.drawable.merlin_0308,
            R.drawable.merlin_0309,
            R.drawable.merlin_0310,
            R.drawable.merlin_0311,
            R.drawable.merlin_0312,
            R.drawable.merlin_0313,
            R.drawable.merlin_0314,
            R.drawable.merlin_0315,
            R.drawable.merlin_0316,
            R.drawable.merlin_0317,
            R.drawable.merlin_0318,
            R.drawable.merlin_0319,
            R.drawable.merlin_0320,
            R.drawable.merlin_0321,
            R.drawable.merlin_0322,
            R.drawable.merlin_0323,
            R.drawable.merlin_0324,
            R.drawable.merlin_0325,
            R.drawable.merlin_0326,
            R.drawable.merlin_0327,
            R.drawable.merlin_0328,
            R.drawable.merlin_0329,
            R.drawable.merlin_0330,
            R.drawable.merlin_0331,
            R.drawable.merlin_0332,
            R.drawable.merlin_0333,
            R.drawable.merlin_0334,
            R.drawable.merlin_0335,
            R.drawable.merlin_0336,
            R.drawable.merlin_0337,
            R.drawable.merlin_0338,
            R.drawable.merlin_0339,
            R.drawable.merlin_0340,
            R.drawable.merlin_0341,
            R.drawable.merlin_0342,
            R.drawable.merlin_0343,
            R.drawable.merlin_0344,
            R.drawable.merlin_0345,
            R.drawable.merlin_0346,
            R.drawable.merlin_0347,
            R.drawable.merlin_0348,
            R.drawable.merlin_0349,
            R.drawable.merlin_0350,
            R.drawable.merlin_0351,
            R.drawable.merlin_0352,
            R.drawable.merlin_0353,
            R.drawable.merlin_0354,
            R.drawable.merlin_0355,
            R.drawable.merlin_0356,
            R.drawable.merlin_0357,
            R.drawable.merlin_0358,
            R.drawable.merlin_0359,
            R.drawable.merlin_0360,
            R.drawable.merlin_0361,
            R.drawable.merlin_0362,
            R.drawable.merlin_0363,
            R.drawable.merlin_0364,
            R.drawable.merlin_0365,
            R.drawable.merlin_0366,
            R.drawable.merlin_0367,
            R.drawable.merlin_0368,
            R.drawable.merlin_0369,
            R.drawable.merlin_0370,
            R.drawable.merlin_0371,
            R.drawable.merlin_0372,
            R.drawable.merlin_0373,
            R.drawable.merlin_0374,
            R.drawable.merlin_0375,
            R.drawable.merlin_0376,
            R.drawable.merlin_0377,
            R.drawable.merlin_0378,
            R.drawable.merlin_0379,
            R.drawable.merlin_0380,
            R.drawable.merlin_0381,
            R.drawable.merlin_0382,
            R.drawable.merlin_0383,
            R.drawable.merlin_0384,
            R.drawable.merlin_0385,
            R.drawable.merlin_0386,
            R.drawable.merlin_0387,
            R.drawable.merlin_0388,
            R.drawable.merlin_0389,
            R.drawable.merlin_0390,
            R.drawable.merlin_0391,
            R.drawable.merlin_0392,
            R.drawable.merlin_0393,
            R.drawable.merlin_0394,
            R.drawable.merlin_0395,
            R.drawable.merlin_0396,
            R.drawable.merlin_0397,
            R.drawable.merlin_0398,
            R.drawable.merlin_0399,
            R.drawable.merlin_0400,
            R.drawable.merlin_0401,
            R.drawable.merlin_0402,
            R.drawable.merlin_0403,
            R.drawable.merlin_0404,
            R.drawable.merlin_0405,
            R.drawable.merlin_0406,
            R.drawable.merlin_0407,
            R.drawable.merlin_0408,
            R.drawable.merlin_0409,
            R.drawable.merlin_0410,
            R.drawable.merlin_0411,
            R.drawable.merlin_0412,
            R.drawable.merlin_0413,
            R.drawable.merlin_0414,
            R.drawable.merlin_0415,
            R.drawable.merlin_0416,
            R.drawable.merlin_0417,
            R.drawable.merlin_0418,
            R.drawable.merlin_0419,
            R.drawable.merlin_0420,
            R.drawable.merlin_0421,
            R.drawable.merlin_0422,
            R.drawable.merlin_0423,
            R.drawable.merlin_0424,
            R.drawable.merlin_0425,
            R.drawable.merlin_0426,
            R.drawable.merlin_0427,
            R.drawable.merlin_0428,
            R.drawable.merlin_0429,
            R.drawable.merlin_0430,
            R.drawable.merlin_0431,
            R.drawable.merlin_0432,
            R.drawable.merlin_0433,
            R.drawable.merlin_0434,
            R.drawable.merlin_0435,
            R.drawable.merlin_0436,
            R.drawable.merlin_0437,
            R.drawable.merlin_0438,
            R.drawable.merlin_0439,
            R.drawable.merlin_0440
    };


    private final static int [] SOUND_MAPPING = {
            R.raw.merlin_snd_01,
            R.raw.merlin_snd_02,
            R.raw.merlin_snd_03,
            R.raw.merlin_snd_04,
            R.raw.merlin_snd_05,
            R.raw.merlin_snd_06,
            R.raw.merlin_snd_07,
            R.raw.merlin_snd_08,
            R.raw.merlin_snd_09,
            R.raw.merlin_snd_10,
            R.raw.merlin_snd_11,
            R.raw.merlin_snd_12,
            R.raw.merlin_snd_13,
            R.raw.merlin_snd_14,
            R.raw.merlin_snd_15,
            R.raw.merlin_snd_16,
            R.raw.merlin_snd_17,
            R.raw.merlin_snd_18,
            R.raw.merlin_snd_19,
            R.raw.merlin_snd_20,
            R.raw.merlin_snd_21,
            R.raw.merlin_snd_22,
            R.raw.merlin_snd_23,
            R.raw.merlin_snd_24,
            R.raw.merlin_snd_25,
            R.raw.merlin_snd_26,
            R.raw.merlin_snd_27,
            R.raw.merlin_snd_28,
            R.raw.merlin_snd_29,
            R.raw.merlin_snd_30,
            R.raw.merlin_snd_31,
            R.raw.merlin_snd_32
    };

    @Override
    public int[] getMapping() {
        return IMAGE_MAPPING;
    }

    @Override
    public int[] getSoundMapping() {
        return SOUND_MAPPING;
    }

    @Override
    public int getNumberRows() {
        return NUMBER_ROWS;
    }

    @Override
    public int getNumberColumns() {
        return NUMBER_COLUMNS;
    }

    @Override
    public int getEmptyFrameId() {
        return R.drawable.merlin_0440;
    }

    @Override
    public int getFirstFrameId() {
        return R.drawable.merlin_0000;
    }
}
