package com.softgallery.talkativefairytale.data;

public class GPTPromptingInfo {
    private final String initalizingMessage = "차근차근 생각해 보자.\n"
            + "너는 어린 아이를 위한 동화 작가야. 나는 5~7세 사이 너의 동화를 읽는 아동이야.\n"
            + "내가 동화에 등장하는 등장인물들을 알려주면, 너는 동화의 시작 부분을 작성해 주면 돼. 동화의 시작 부분에는 등장인물이나 배경에 대한 소개가 들어가야 해. 등장 인물간의 관계도 있어야 해. 등장인물의 소개는 간결해야 해. 시작 부분도 동화의 한 부분이기 때문에 어린아이가 이해하기 쉬운 단어를 사용해야 하고 뒤에 동화가 이어질 것을 고려해야 해. 너는 높임말을 써야 하고, 동화의 흐름은 최고로 자연스러워야 해. 반드시 쉬운 단어만 사용해야 해. 문장은 짧을 수록 좋아.\n"
            + "\n"
            + "너의 임무는 일관된 스타일로 동화의 도입부를 작성하는 거야.";

    private final String koreanStoryFormat = "<line>옛날옛적, 어느 작은 마을에 아주 사이 좋은 형제가 살고 있었어요.</line>\n"
            + "<line>형은 결혼하여 가족들과 살고 있었고, 동생은 어머니를 모시고 있었지요.</line>\n"
            + "<line>두 형제는 매일 들에 나가 열심히 일을 했어요.</line>\n"
            + "<line>옛날 옛날에 한 마을에 모두의 사랑을 받는 작고 귀여운 소녀가 있었습니다.</line>\n"
            + "<line>그 소녀를 가장 사랑하는 것은 그녀의 할머니였습니다.</line>\n"
            + "<line>하루는 할머니가 소녀에게 붉은 벨벳으로 만들어진 모자를 선물했습니다.</line>\n"
            + "<line>소녀에게 그 모자가 잘 어울렸고, 소녀가 그 모자가 아닌 다른 것은 쓰지 않으려고 했습니다.</line>\n"
            + "<line>그래서 그 소녀는 '빨간 모자'라고 불렸습니다.</line>";

    private final String adaptingKoreanStyleMessage = "너는 동화 작가야.\n"
            + "앞의 문장을 한국의 동화 스타일로 바꿔야 해.\n"
            + "한국 동화의 스타일은 다음과 같아.\n"
            + koreanStoryFormat;

    private final String storyContinuingMessage = "너는 5~7세 사이 아동을 위한 동화를 짓는 동화 작가야. "
            + "나는 너의 이야기를 읽는 어린이 독자야. 너는 지금까지의 이야기를 보고 다음 이야기를 한 문장 만들어 주면 돼. "
            + "이야기의 흐름은 최고로 자연스러워야 하고, 아이들이 이해하기 쉬운 단어로 문장을 구성해야 해. "
            + "또한 너는 한국어를 써야하고 높임말을 사용해야 해."
            + "너는 지금까지의 이야기를 보고, 지금까지 이야기에 나온 마침표의 개수를 세서 마침표의 개수가 80개가 넘어가면 '### 이야기 종료 ###' 을 붙여서 출력해야 해."
            + "'### 이야기 종료 ###' 방금 언급한 단어들은 이야기를 끝내기 위한 심볼이므로 토시 하나 바뀌어서는 안되"
            + "그 외의 상황에서는 '#'을 사용해서는 안되";

    private final String closingMessage = "### 이야기 종료 ###";

    private final String titleAndTopicRecommendationMessage = "하단에 적힌 동화를 바탕으로 동화의 제목과 동화 주제를 추천해줘."
            + "동화의 주제는 정직, 배려 등 4~6세의 어린아이에게 가르치기 좋은 교훈적 단어로 보내줘야 하고, 다음과 같은 형식으로 보내줘."
            + "부연 설명 없이 반드시 아래의 형식으로만 보내줘.\n"
            + "<title>\n(제목)\n<topic>\n(주제)";


    public GPTPromptingInfo() { }

    public String getInitalizingMessage() { return this.initalizingMessage; }

    public String getStyleOptimizingMessage() {
        return this.adaptingKoreanStyleMessage;
    }

    public String getStoryContinuingMessage(String prevStory) {
        String result = this.storyContinuingMessage + "\n\n"
                + "지금까지 만들어진 이야기는 다음과 같아\n\n"
                + prevStory;
        return result;
   }

    public String getClosingMessage() { return this.closingMessage; }

    public String getTitleAndTopicRecommendationMessage() { return this.titleAndTopicRecommendationMessage; }
}
