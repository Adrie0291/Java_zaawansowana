package Day3.EnumStare;

public class Sizes {
    public final static String XXL = "XXL";
    public final static String XL = "XL";
    public final static String L = "L";
    public final static String M = "M";
    public final static String S = "S";
    public final static String XS = "XS";
    public final static String XXS = "XXS";
}
/*
Jezeli klasa jest prywatna to si� nie dostaniemy do tych warto�ci.
musimy da� publiczne.
Zasada enksapsulacji nie jest mocno istotna bo mo�emy zmieni� typ na final

Rozwi�zanie to jest lepsze, poniewa� wybieraj�c kt�r�� z tych zmiennych
nie ma ryzyka, �e kto� wpisze to w inny spos�b.

Gdy nie damy typu final przy warto�ci instrukcja Switch nie pozowli nam na to, poniewa�
switch oczekuje STA�EJ warto�ci, a bez final zmienn� mo�na �atwo zmieni�.

Konwencja wykorzystywana w JFRame. albo Thread.
 */