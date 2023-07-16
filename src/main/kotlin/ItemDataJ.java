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



}
