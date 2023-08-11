package headfirst.designpatterns.observer.weather.subject;

import headfirst.designpatterns.observer.weather.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
