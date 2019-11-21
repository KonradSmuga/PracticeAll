package enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class TestEnum {

    public static void main(String[] args) {

        TicketType ticketType = TicketType.TASK;
        System.out.println(ticketType);

        System.out.println("-------------");

        System.out.println(ticketType.ordinal());

        System.out.println("--------------");

        for (TicketType ticketType1 : TicketType.values()) {
            System.out.println(ticketType1.getPriority());
        }

        System.out.println("--------------");

        for (TicketType ticketType1 : TicketType.values()) {
            System.out.println(ticketType1.isAssigned());
        }

        for (TicketType ticketType1 : TicketType.values()) {
            ticketType1.comment();
        }


        TicketType bug = TicketType.BUG;
        TicketType suggestion = TicketType.SUGGESTION;

        System.out.println(bug == suggestion);

        OtherType first = OtherType.FIRST;
//        System.out.println(bug == first);

        Set<TicketType> ticketTypeSet = EnumSet.of(TicketType.TASK, TicketType.BUG, TicketType.SUGGESTION);

        ticketTypeSet.forEach(System.out:: println);

        EnumMap<TicketType, String> enumMap = new EnumMap<TicketType, String>(TicketType.class);

        enumMap.put(TicketType.BUG, "Dawid Nowak");
        enumMap.put(TicketType.TASK, "Paweł Cwik");

        System.out.println(enumMap.get(TicketType.TASK));
    }


}
