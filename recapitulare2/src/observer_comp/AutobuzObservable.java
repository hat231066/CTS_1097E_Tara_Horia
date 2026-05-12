package observer_comp;

public interface AutobuzObservable {
    void adaugaCalator(CalatorObserver calator);
    void stergeCalator(CalatorObserver calator);
    void notificaCalatori();
}