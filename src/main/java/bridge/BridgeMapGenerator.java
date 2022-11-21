package bridge;


import bridge.constant.Constant;

import java.util.List;

public enum BridgeMapGenerator {

    RIGHT_ANSWER_INPUT_UP("O", " "),
    RIGHT_ANSWER_INPUT_DOWN(" ", "O"),
    WRONG_ANSWER_INPUT_UP("X", " "),
    WRONG_ANSWER_INPUT_DOWN(" ", "X"),;

    private final String resultOfUp;
    private final String resultOfDown;

    BridgeMapGenerator(String resultOfUp, String resultOfDown) {
        this.resultOfUp = resultOfUp;
        this.resultOfDown = resultOfDown;
    }

    public static List<List<String>> generateRightAnswerMap(String moving, List<List<String>> bridgeMap) {
        if (moving.equals(Constant.UP)) {
            bridgeMap.get(0).add(RIGHT_ANSWER_INPUT_UP.resultOfUp);
            bridgeMap.get(1).add(RIGHT_ANSWER_INPUT_UP.resultOfDown);
            return bridgeMap;
        }
        bridgeMap.get(0).add(RIGHT_ANSWER_INPUT_DOWN.resultOfUp);
        bridgeMap.get(1).add(RIGHT_ANSWER_INPUT_DOWN.resultOfDown);
        return bridgeMap;
    }

    public static List<List<String>> generateWrongAnswerMap(String moving, List<List<String>> bridgeMap) {
        if (moving.equals(Constant.UP)) {
            bridgeMap.get(0).add(WRONG_ANSWER_INPUT_UP.resultOfUp);
            bridgeMap.get(1).add(WRONG_ANSWER_INPUT_UP.resultOfDown);
            return bridgeMap;
        }
        bridgeMap.get(0).add(WRONG_ANSWER_INPUT_DOWN.resultOfUp);
        bridgeMap.get(1).add(WRONG_ANSWER_INPUT_DOWN.resultOfDown);
        return bridgeMap;
    }

    private static void generateMap(BridgeMapGenerator bridgeMapGenerator, List<List<String>> bridgeMap) {
        bridgeMap.get(0).add(bridgeMapGenerator.resultOfUp);
        bridgeMap.get(1).add(bridgeMapGenerator.resultOfDown);
    }
}
