package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class SamsungObservableImpl implements StocksObservable{

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

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
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setCount(int newStockAdded) {
        if(stockCount == 0){
            notifyAllSubscriber();
        }

        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
