package headfirst.designpatterns.observer.weatherobserable.subject;

import headfirst.designpatterns.observer.weatherobserable.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
