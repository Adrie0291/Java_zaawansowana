package Day5.Excep.Wywolanie;

public class BookMapping extends RuntimeException { // mechanizm, pwodouje ze wyj�tek Exception wymaga obs�ugi || RuntimException nie trzeba obs�ugi, nie trzeba throws itp. troche wygodniejsze ale mniej bezpiezcne

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
Taki obiekt ma du�o informacji. Spos�b aby z metod przekaza� dane na temat b��du az na sam�g�r� do try catch, nie u�ywaj�� return.
 */