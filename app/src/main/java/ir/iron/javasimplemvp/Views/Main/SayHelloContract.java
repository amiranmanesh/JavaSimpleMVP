package ir.iron.javasimplemvp.Views.Main;

public interface SayHelloContract {

    /** Represents the View in MVP. */
    interface View {
        void showMessage(String message);

        void showError(String error);
    }

    /** Represents the Presenter in MVP. */
    interface Presenter {
        void loadMessage();

        void saveName(String firstName, String lastName);
    }

}
