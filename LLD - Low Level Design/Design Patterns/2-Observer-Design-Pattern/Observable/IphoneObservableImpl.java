package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockAvailable = 0;
    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyAllSubscriber() {
        for(NotificationAlertObserver ob: observerList){
            ob.update();
        }
    }

    @Override
    public void setCount(int newStockAdded) {
        if(stockAvailable == 0){
            notifyAllSubscriber();
        }

        stockAvailable = stockAvailable + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockAvailable;
    }


}
