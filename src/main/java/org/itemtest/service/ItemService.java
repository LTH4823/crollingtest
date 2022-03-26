package org.itemtest.service;

import lombok.AllArgsConstructor;
import org.itemtest.dao.ItemDAO;
import org.itemtest.domain.ItemVO;

import java.util.ArrayList;

@AllArgsConstructor
public class ItemService {

    private ItemDAO itemDAO;

    public ArrayList<ItemVO> itemAll(){
        return itemDAO.getItems();
    }

    public ArrayList<ItemVO> itemSortMax(){
        return itemDAO.sortMaxItems();
    }

    public ArrayList<ItemVO> itemSortMin(){
        return itemDAO.sortMinItems();
    }

}
