package Observable;

import Observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver obj);

    void remove(NotificationAlertObserver obj);

    void notifyAllSubscriber();

    void setCount(int newStockAdded);

    int getStockCount();
}
