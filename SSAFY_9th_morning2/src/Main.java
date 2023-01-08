/*
N개의 칸이 좌우로 있고 각 칸에는 보석이 있거나 없거나 한다.
욕심쟁이는 임의의 칸에서 출발할 수 있는데, 현재 칸에서 가장 가까운 보석이 있는 칸으로 가서 그 보석을 차지하는 것을 반복한다. 차지한 보석은 칸에서 사라진다.
만약 보석이 있는 가장 가까운 칸이 2개가 되는 경우 욕심이 폭발하여 보석을 가져가지 못한다.

왼쪽에서 M번째로 주어지는 기준 칸이 있다. 욕심쟁이가 출발하는 칸을 기준 칸에서 제일 가까운 칸으로 잡아 욕심이 폭발하지 않도록 하고, 그러한 경우에 기준 칸에서의 거리를 계산하는 프로그램을 작성하라.
기준 칸에는 보석이 있을 수도 없을 수도 있다. 욕심쟁이의 시작 칸도 마찬가지다.

N=17, M=9인 예를 생각해 보자. 아래 그림에서 0인 칸은 보석이 없고, 1인 칸은 보석이 있다는 의미이다. 그림에서 붉은 색이 칠해진 칸이 기준 칸이다.
기준 칸에서 출발하는 경우 바로 오른쪽에 있는 보석을 차지하고, 양쪽으로 가장 가까운 보석의 거리가 같아서 폭발한다.

하지만, 기준 칸에서 왼쪽으로 3 칸을 이동한 다음 출발하는 경우 폭발하지 않고 모든 보석을 차지하게 됨을 알 수 있다. 차지한 보석은 칸에서 사라진다는 것에 주의하라.
* */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}