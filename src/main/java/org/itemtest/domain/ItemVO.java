package org.itemtest.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ItemVO {
    int itemNum;
    String ItemName;
    String ItemUrl;
    int ItemPrice;
}
