package chap09.sec04.exam01_nestedinterface;

public class Button {
    OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }
}