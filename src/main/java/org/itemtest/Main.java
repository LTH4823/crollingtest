package org.itemtest;

import org.itemtest.dao.ItemDAO;
import org.itemtest.service.ItemService;
import org.itemtest.ui.ItemUI;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        ItemDAO itemDAO = new ItemDAO();
//        ItemService itemService = new ItemService(itemDAO);
//        Scanner scanner = new Scanner(System.in);
//        ItemUI ui = new ItemUI(itemService,scanner);
//        ui.display();
        ItemDAO itemDAO = new ItemDAO();
        System.out.println(itemDAO.getItems());
    }
}
