package Observer;

import Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String userName;
    StocksObservable stocksObservable;

    public MobileAlertObserver(String userName, StocksObservable stocksObservable){
        this.stocksObservable = stocksObservable;
        this.userName = userName;
    }

    @Override
    public void update(){
        System.out.println("Mobile msg sent to : "+userName );
    }
}
