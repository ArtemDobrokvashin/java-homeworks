package model;

public enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int idPriority;


    Priority(int idPriority) {
        this.idPriority = idPriority;
    }

    public int getIdPriority(){
        return idPriority;
    }

}

