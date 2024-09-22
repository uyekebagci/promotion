package umut.banking.demo.entity.enums;

import lombok.Getter;

public class PromotionEnum
{
    @Getter
    public enum Answer
    {
        NO("NO"),
        YES("YES");

        private final String label;
        
        private Answer(String label)
        {
            this.label = label;
        }

    }

    public enum CouponLoadType
    {
        GENERAL("General"),
        EXCEL("Excel");

        private final String label;

        private CouponLoadType(String label)
        {
            this.label = label;
        }

        public String getLabel()
        {
            return label;
        }
    }

    public enum CompanyType
    {
        AJ("AJ"),
        TK("TK");

        private final String label;

        private CompanyType(String label)
        {
            this.label = label;
        }

        public String getLabel()
        {
            return label;
        }
    }

    public enum PromotionLoadType
    {
        GENERAL("General"),
        THIRD_PARTY("Third Party");

        private final String label;

        private PromotionLoadType(String label)
        {
            this.label = label;
        }

        public String getLabel()
        {
            return label;
        }
    }

    public enum DirectionType
    {
        ORIGIN("O"),
        DESTINATION("D");

        private final String label;

        private DirectionType(String label)
        {
            this.label = label;
        }

        public String getLabel()
        {
            return label;
        }
    }

    public enum UploadType
    {
        CREATE,
        UPDATE;
    }

    public enum BlackListType
    {
        GLOBAL,
        PROMOTION;
    }

    public enum ChannelType
    {
        SALE;
    }

    public enum Condition
    {
        AND("AND"),
        OR("OR");

        private final String label;

        private Condition(String label)
        {
            this.label = label;
        }

        public String getLabel()
        {
            return label;
        }
    }

    public enum WeightType
    {
        KG,
        PC;
    }

    public enum NumberCondition
    {
        EQUAL("="),
        GREATER(">"),
        LOWER("<");

        private final String label;

        private NumberCondition(String label)
        {
            this.label = label;
        }

        public String getLabel()
        {
            return label;
        }
    }

    public enum Currency
    {
        TRY("₺"),
        USD("$"),
        EUR("€");

        private final String label;

        private Currency(String label)
        {
            this.label = label;
        }

        public String getLabel()
        {
            return label;
        }
    }

    public enum CompensationCouponUsageStatus
    {
        NOT_USED("NOT_USED"), USED("USED"), CANCELLED ("CANCELLED");

        private String value;

        public String getValue()
        {
            return value;
        }

        private CompensationCouponUsageStatus(String value)
        {
            this.value = value;
        }

        public static CompensationCouponUsageStatus findByName(String name)
        {
            for (CompensationCouponUsageStatus v : values())
            {
                if (v.name().equals(name))
                {
                    return v;
                }
            }
            return null;
        }
    }

    public enum UsageStatus
    {
        NOT_USED("NOT_USED"), USED("USED"), CANCELLED ("CANCELLED");

        private String value;

        public String getValue()
        {
            return value;
        }

        private UsageStatus(String value)
        {
            this.value = value;
        }

        public static UsageStatus findByName(String name)
        {
            for (UsageStatus v : values())
            {
                if (v.name().equals(name))
                {
                    return v;
                }
            }
            return null;
        }
    }

    public enum Status
    {
        ACTIVE("ACTIVE"),
        PASSIVE("PASSIVE");

        private String value;

        public String getValue() {
            return value;
        }

        private Status(String value)
        {
            this.value = value;
        }

        public static Status findByName(String name) {
            for (Status v : values()) {
                if (v.name().equals(name)) {
                    return v;
                }
            }
            return null;
        }
    }

    public enum BatchStatus
    {
        RUNNING,
        FINISHED;
    }
}
