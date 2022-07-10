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
Jezeli klasa jest prywatna to siê nie dostaniemy do tych wartoœci.
musimy daæ publiczne.
Zasada enksapsulacji nie jest mocno istotna bo mo¿emy zmieniæ typ na final

Rozwi¹zanie to jest lepsze, poniewa¿ wybieraj¹c któr¹œ z tych zmiennych
nie ma ryzyka, ¿e ktoœ wpisze to w inny sposób.

Gdy nie damy typu final przy wartoœci instrukcja Switch nie pozowli nam na to, poniewa¿
switch oczekuje STA£EJ wartoœci, a bez final zmienn¹ mo¿na ³atwo zmieniæ.

Konwencja wykorzystywana w JFRame. albo Thread.
 */