package academy.devdojo.javaoneforall.enumeration.domain;

public enum PaymentType {
        DEBIT{
            @Override
            public double calculateDiscount(double value) {
                return value * 0.1;
            }
        }, CREDIT;

        public double calculateDiscount(double value) {
            return 0;
        }
}

