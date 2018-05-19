package chap07extends.cellphone;

public class DmbCellPhoneExample {

    public static void main(String[] args) {

        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "black", 10);

        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);


        System.out.println("채널: " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.reciveVoice("안녕하세요 전 홍길동입니다.");
        dmbCellPhone.sendVoice("네 ");
        dmbCellPhone.hangUp();


        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.powerOff();
    }
}
