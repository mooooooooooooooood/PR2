package PR2.tut12.greetings;

public class MobilePhone {
    // Attributes
    private String manName;
    private String model;
    private Color color;
    private int year;
    private boolean guaranteed;
    private String colorCode;

    // Operations
    public MobilePhone(String n, String m, Color c, int y, boolean g) throws NotPossibleException {
        if (!validateManName(n)) {
            throw new NotPossibleException("MobilePhone initialization: invalid manName: " + n);
        }
        if (!validateModel(m)) {
            throw new NotPossibleException("MobilePhone initialization: invalid model: " + m);
        }
        if (!validateColor(c)) {
            throw new NotPossibleException("MobilePhone initialization: invalid color: " + c);
        }
        if (!validateYear(y)) {
            throw new NotPossibleException("MobilePhone initialization: invalid year: " + y);
        }
        this.manName = n;
        this.model = m;
        this.color = c;
        this.year = y;
        this.guaranteed = g;
        this.colorCode = deriveColorCode(c);
    }

    public MobilePhone(String n, String m, char c, int y, boolean g) throws NotPossibleException {
        this(n, m, charToColor(c), y, g); // re-use a method overloading
    }

    private static Color charToColor(char c) {
        Color newColor;
        switch (c) {
            case 'R':
                newColor = Color.Red;
                break;
            case 'O':
                newColor = Color.Orange;
                break;
            case 'Y':
                newColor = Color.Yellow;
                break;
            case 'B':
                newColor = Color.Blue;
                break;
            case 'P':
                newColor = Color.Purple;
                break;
            default:
                newColor = null;
        }
        return newColor;
    }

    private String deriveColorCode(Color c) {
        String code;
        switch (c) {
            case Red:
                code = "#FF0000"; // Red
                break;
            case Orange:
                code = "#FFA500"; // Orange
                break;
            case Yellow:
                code = "#FFFF00"; // Yellow
                break;
            case Blue:
                code = "#0000FF"; // Blue
                break;
            case Purple:
                code = "#800080"; // Purple
                break;
            default:
                code = "#000000"; // Default to black if color not recognized
        }
        return code;
    }

    // Mutators
    public boolean setManName(String n) {
        if (validateManName(n)) {
            this.manName = n;
            return true;
        } else {
            return false;
        }
    }

    public boolean setColor(Color c) {
        if (validateColor(c)) {
            this.color = c;
            this.colorCode = deriveColorCode(c); // Update color code when color is set
            return true;
        } else {
            return false;
        }
    }

    public boolean setGuarantee(boolean g) {
        this.guaranteed = g;
        return true;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    // Observers
    public String getManName() {
        return this.manName;
    }

    public String getModel() {
        return this.model;
    }

    public Color getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public String getColorCode() {
        return this.colorCode;
    }

    public boolean isGuaranteed() {
        return this.guaranteed;
    }

    // Helpers
    private boolean validateManName(String n) {
        // optional(manName) = false
        if (n == null || n.length() == 0) return false;
        // length(manName) = 30
        return n.length() <= 30;
    }

    private boolean validateModel(String m) {
        // optional(model) = false
        if (m == null || m.length() == 0) return false;
        // length(model) = 30
        if (m.length() > 30) return false;
        // model.match(/^M-[A-Z]{3}-[0-9]{3}$/)
        return m.matches("^M-[A-Z]{3}-[0-9]{3}$");
    }

    private boolean validateColor(Color c) {
        return c != null;
    }

    private boolean validateYear(int y) {
        return y >= 1970;
    }

    // Default methods
    // Example toString: "MobilePhone: <Samsung, S20, P, 2019, true>"
    @Override
    public String toString() {
        return "MobilePhone: <" + manName +
                ", " + model + ", " + color +
                ", " + year + ", " + guaranteed + '>';
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: implement this
        return super.equals(obj);
    }

    @Override
    public Object clone() {
        return new MobilePhone(manName, model, color, year, guaranteed);
    }

    public boolean repOK() {
        return validateColor(color) && validateManName(manName)
                && validateModel(model) && validateYear(year);
    }
}
