package Day5.Excep.Wywolanie;

public class BookMapping extends RuntimeException { // mechanizm, pwodouje ze wyj¹tek Exception wymaga obs³ugi || RuntimException nie trzeba obs³ugi, nie trzeba throws itp. troche wygodniejsze ale mniej bezpiezcne

    private String line;

    public BookMapping(String message, String line) {
        super(message);
        this.line = line;
    }

    public String getLine() {
        return line;
    }
}

/*
Taki obiekt ma du¿o informacji. Sposób aby z metod przekazaæ dane na temat b³êdu az na sam¹górê do try catch, nie u¿ywaj¹æ return.
 */