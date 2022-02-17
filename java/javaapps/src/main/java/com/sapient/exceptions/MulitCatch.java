package com.sapient.exceptions;

public class MulitCatch {

    public static void checkMultiCatch() {
        try {
            String str = "10";
            System.out.println(Integer.parseInt(str));
            String str2 = "";
            System.out.println(str2.toUpperCase());
            int a = 10;
            int res = a / 0;
            System.out.println(res);

        } catch (NumberFormatException es) {
            System.out.println("Number error");
        } catch (NullPointerException es) {
            System.out.println("Null Error");
        } catch (RuntimeException es) {
            System.out.println(es.getMessage());
        } catch (Exception es) {
            System.out.println(es.getMessage());
        } catch (Throwable es) {
            System.out.println(es.getMessage());
        }
    }

    public static void main(String[] args) {
        checkMultiCatch();
    }
}
