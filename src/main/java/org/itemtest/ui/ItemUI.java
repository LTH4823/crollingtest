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

                for (int i = 0; i < itemService.itemAll().size(); i++) {
                    System.out.println(itemService.itemAll().get(i));
                }
                break;

            case 2:
                for (int i = 0; i < itemService.itemSortMax().size(); i++) {
                    System.out.println(itemService.itemSortMax().get(i));
                }
                break;

            case 3:
                for (int i = 0; i < itemService.itemSortMin().size(); i++) {
                    System.out.println(itemService.itemSortMin().get(i));
                }
                break;
        }


    }

}
