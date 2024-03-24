public class BaseballView {
    public void printTurnInputMessage(){
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printScore(TurnResult score){
        if(score.strike != 0){
            System.out.print(score.strike + "스트라이크 ");
        }

        if(score.ball != 0){
            System.out.print(score.ball + "볼 ");
        }

        if(score.strike == 0 && score.ball == 0) {
            System.out.print("낫싱");
        }

        System.out.println();
    }
}
