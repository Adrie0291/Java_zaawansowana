package Day17.Challenge2;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Customer> customers;

    public Shop(List<Customer> customers) {
        this.customers = customers;
    }

//zwróć imiona customerów posortowane alfabetycznie
//zwróć średni wiek customerów
//zwróć customerów którzy mają jakieś zamówienia
//zwróć tylko pełnoletnich customerów posortowanych po ich wieku
//zwróć zamówienia nie starsze niż tydzień
//zwróć średnią ilość produktów w zamówieniach
//zwróć średnią cenę produktów ze wszystkich zamówień
//zwróć customera, który złożył wydał najwięcej
//zwróć produkt którego mamy najmniej (wg. amound)
//zwróć wszystkie produkty zamówione później niż tydzień temu

//trudne:
//zwróć mapę której kluczem będzie numer miesiąca a wartością ilość customerów urodzonych w danym miesiącu
//zwróć mapę zawierającą kraj oraz ilość produktów pochodzących z tego kraju
}
