import java.util.Scanner;

public class RacingView {
    Scanner scanner = new Scanner(System.in);

    public String readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분");

        return scanner.nextLine();
    }
}
