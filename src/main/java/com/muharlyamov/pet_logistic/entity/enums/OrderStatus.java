package com.muharlyamov.pet_logistic.entity.enums;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum OrderStatus {

    ALL("Все", "all"),
    NEW("Новый", "new"),
    READY_TO_DELIVERY("К отгрузке", "readyToDelivery"),
    DELIVERY_IN_PROGRESS("Доставляется", "deliveryInProgress"),
    DELIVERED("Отгружен", "delivered");

    private String russianView;
    private String englishView;

    OrderStatus(String russianView, String englishView) {
        this.russianView = russianView;
        this.englishView = englishView;
    }

    public static OrderStatus getStatusByRussianView(String russianView) {
        for (OrderStatus orderStatusItem : OrderStatus.values()){
            if (orderStatusItem.russianView.equals(russianView)){
                return orderStatusItem;
            }
        }
        return null;
    }

    public String getRussianView(){
        return this.russianView;
    }

    public String getEnglishView(){
        return this.englishView;
    }

    public static List<String> getStatusListForSelect(){
        List<String> statusList = Arrays.stream(OrderStatus.values()).map(p -> p.getRussianView()).collect(Collectors.toList());
        return statusList;
    }
}
