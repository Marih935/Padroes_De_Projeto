public class App {
    public static void main(String[] args) {
        MPay mPay = new MPayImpl();
        mPay.setCreditCardNo("1234567890123456");
        mPay.setCustomerName("Juninho");
        mPay.setCardExpMonth("12");
        mPay.setCardExpYear("24");
        mPay.setCardCVVNo((short) 123);
        mPay.setAmount(382.5);

        PPay pPay = new MPayToPPayAdapter(mPay);
        testPPay(pPay);
    }

    public static void testPPay(PPay pp) {
        System.out.println(pp.getCardOwnerName());
        System.out.println(pp.getCustCardNo());
        System.out.println(pp.getCardExpMonthDate());
        System.out.println(pp.getCVVNo());
        System.out.println(pp.getTotalAmount());
    }
}
