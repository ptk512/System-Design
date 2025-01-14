import Observable.IphoneObservableImpl;
import Observable.SamsungObservableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iPhoneObservable = new IphoneObservableImpl();
        StocksObservable samsungObservable = new SamsungObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz1_@gmail.com", iPhoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("abc1_@gmail.com", iPhoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("abcd_123", iPhoneObservable);

        NotificationAlertObserver observer4 = new MobileAlertObserver("samsung_observer", samsungObservable);

        iPhoneObservable.add(observer1);
        iPhoneObservable.add(observer2);
        iPhoneObservable.add(observer3);
        samsungObservable.add(observer4);


        iPhoneObservable.setCount(100);
        samsungObservable.setCount(10);
 

    }
}
