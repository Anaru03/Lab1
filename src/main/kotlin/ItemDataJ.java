//Código en Java

public class ItemDataJ {
    Object originalValue;


    public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;
    }

    public String getType() {
        if (originalValue == null) {
            return null;
        }

        Class<?> valueType = originalValue.getClass();

        switch (valueType.getSimpleName()) {
            case "String":
                return "cadena";
            case "Integer":
                return "entero";
            case "Boolean":
                return "booleano";
            default:
                return null;
        }
    }


    public String getInfo() {
        if (originalValue instanceof String) {
            return "L" + ((String) originalValue).length();
        } else if (originalValue instanceof Integer) {
            int value = (Integer) originalValue;
            if (value % 10 == 0) {
                return "M10";
            } else if (value % 5 == 0) {
                return "M5";
            } else if (value % 2 == 0) {
                return "M2";
            } else {
                return null;
            }
        } else if (originalValue instanceof Boolean) {
            boolean value = (Boolean) originalValue;
            return value ? "Verdadero" : "Falso";
        } else {
            return null;
        }
    }

}
