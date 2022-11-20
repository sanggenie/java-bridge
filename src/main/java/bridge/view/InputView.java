package bridge.view;

import bridge.validator.BridgeSizeValidator;
import bridge.validator.MovingValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String REQUEST_BRIDGE_SIZE = "다리의 길이를 입력해주세요.";
    private static final String REQUEST_MOVING = "이동할 칸을 선택해주세요. (위: U, 아래: D)";

    public static int readBridgeSize() {
        System.out.println(REQUEST_BRIDGE_SIZE);
        String input = Console.readLine();
        BridgeSizeValidator.validateBridgeSize(input);
        return Integer.parseInt(input);
    }

    public static String readMoving() {
        System.out.println(REQUEST_MOVING);
        String input = Console.readLine();
        MovingValidator.validateMoving(input);
        return input;
    }

    public static String readGameCommand() {
        return null;
    }
}
