package swadaptableutil.xhl.com.lib_swadaptable;


public enum DimenTypes {

    //适配Android 3.2以上   大部分手机的sw值集中在  300-460之间 300,320,360,411，450，这几个尺寸是比较必要的
    DP_sw__375(375),  // values-sw375 和设计稿一致 到时候放到默认values目录中

    DP_sw__300(300),  // values-sw300
    DP_sw__310(310),
    DP_sw__320(320),
    DP_sw__330(330),
    DP_sw__340(340),
    DP_sw__360(360),
    DP_sw__411(411),
    DP_sw__420(420),
    DP_sw__430(430),
    DP_sw__450(450),
    DP_sw__460(460);
    // 想生成多少自己以此类推


    /**
     * 屏幕最小宽度
     */
    private int swWidthDp;


    DimenTypes(int swWidthDp) {

        this.swWidthDp = swWidthDp;
    }

    public int getSwWidthDp() {
        return swWidthDp;
    }

    public void setSwWidthDp(int swWidthDp) {
        this.swWidthDp = swWidthDp;
    }

}
