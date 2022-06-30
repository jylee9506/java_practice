package org.zerock;
import java.util.Scanner;

public class RestaurantUI {
    Item[] ch = new ItemArr().itemSet();
    ItemMinMax itemMinMax = new ItemMinMax();

    public void result(){
        int money = 0;
        Item maxItem = new Item("",0);
        Item minItem = new Item("",100000);;

        System.out.println("금액을 입력해 주십시오.");
        Scanner scanner = new Scanner(System.in);
        money = Integer.parseInt(scanner.nextLine());
        itemMinMax.ItemCalculate(money);
        minItem = itemMinMax.chSelct[0];
        maxItem = itemMinMax.chSelct[1];

        System.out.println("최대 구매가능 메뉴는 "+maxItem.name+"이며, 가격은 "+maxItem.price+"입니다.");
        System.out.println("최소 구매가능 메뉴는 "+minItem.name+"이며, 가격은 "+minItem.price+"입니다.");
    }

}
