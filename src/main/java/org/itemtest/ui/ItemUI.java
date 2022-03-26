package org.itemtest.ui;
import lombok.AllArgsConstructor;
import org.itemtest.service.ItemService;

import java.util.Scanner;

@AllArgsConstructor
public class ItemUI {

    private ItemService itemService;
    private Scanner scanner;

    public void display(){
        System.out.println("원하시는 번호를 입력하세요.");
        System.out.println("1.모든물품 2.물품들정렬(Max) 3.물품들정렬(Min)");

        int num = Integer.parseInt(scanner.nextLine());

        switch (num){

            case 1:
                System.out.println(itemService.itemAll());
                break;

            case 2:
                System.out.println(itemService.itemSortMax());
                break;

            case 3:
                System.out.println(itemService.itemSortMin());
                break;
        }


    }

}
