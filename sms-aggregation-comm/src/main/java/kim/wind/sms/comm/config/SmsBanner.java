package kim.wind.sms.comm.config;

import kim.wind.sms.comm.constant.Constant;

public class SmsBanner {

    private static final String banner =
            "   _____   __  __    _____                     _____    _____   _____    ______    _____              _______   _____    ____    _   _ \n" +
                    "  / ____| |  \\/  |  / ____|           /\\      / ____|  / ____| |  __ \\  |  ____|  / ____|     /\\     |__   __| |_   _|  / __ \\  | \\ | |\n" +
                    " | (___   | \\  / | | (___            /  \\    | |  __  | |  __  | |__) | | |__    | |  __     /  \\       | |      | |   | |  | | |  \\| |\n" +
                    "  \\___ \\  | |\\/| |  \\___ \\          / /\\ \\   | | |_ | | | |_ | |  _  /  |  __|   | | |_ |   / /\\ \\      | |      | |   | |  | | | . ` |\n" +
                    "  ____) | | |  | |  ____) |        / ____ \\  | |__| | | |__| | | | \\ \\  | |____  | |__| |  / ____ \\     | |     _| |_  | |__| | | |\\  |\n" +
                    " |_____/  |_|  |_| |_____/        /_/    \\_\\  \\_____|  \\_____| |_|  \\_\\ |______|  \\_____| /_/    \\_\\    |_|    |_____|  \\____/  |_| \\_|\n" +
                    "                                                                                                                                       \n" +
                    "                                                                                                                             ";
    public static void PrintBanner(String version) {
        System.out.println(banner+version);
    }
}