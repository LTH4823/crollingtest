package org.itemtest.dao;

import org.itemtest.domain.ItemVO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public class ItemDAO {

    private ArrayList<ItemVO> itemList;

    public ItemDAO() throws IOException {

        String path = "https://www.gundamboom.com/product/list.html?cate_no=001";
        URL url = new URL(path);
        Document document = Jsoup.parse(url, 10000);
        Elements items = document.select(".product_list2 .rightPad");

        final int[] idx = {0};

        itemList = new ArrayList<>();

        items.stream().forEach(element -> {

            String itemName = element.attr("title");
            String itemImg = element.select("dt img").attr("src");
            int itemPrice= Integer.parseInt(element.select(".price .right span").text().replaceAll(",",""));

            ItemVO item = new ItemVO(idx[0],itemName,itemImg,itemPrice);

            idx[0]++;

            itemList.add(item);
        });

    }


    public ArrayList<ItemVO> getItems(){
        return (ArrayList<ItemVO>) itemList.clone();
    }

    public ArrayList<ItemVO> sortMaxItems(){
        ArrayList<ItemVO> result = getItems();
        Collections.sort(result,(a,b)-> b.getItemPrice()-a.getItemPrice());
        return result;
    }

    public ArrayList<ItemVO> sortMinItems(){
        ArrayList<ItemVO> result = getItems();
        Collections.sort(result,(a,b)-> a.getItemPrice()-b.getItemPrice());
        return result;
    }
}
