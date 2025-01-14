package Observer;

import Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserver(String emailId, StocksObservable stocksObservable){
        this.stocksObservable = stocksObservable;
        this.emailId = emailId;
    }

    @Override
    public void update(){
        System.out.println("Email alert sent to " + emailId);
    }
}
