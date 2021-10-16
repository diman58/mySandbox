package Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonConditions {
    public static String login = "market-nord1@mail.ru";
    public static String password = "DemoPasswor4";
    public static String myUserName = "DemoName";
    public static String biography = "If you’re anything like me, you probably don't think about your professional" +
            " bio until you’re suddenly asked to \"shoot one over via email.\" You have approximately one afternoon" +
            " to come up with it, and that's when you scramble, and the bio ends up reading like this:";

    public static List<String> expectedTopics = new ArrayList(Arrays.asList("Design", "Health & Fitness",
            "Technology", "Photography", "Lifestyle", "Marketing", "Personal Development", "Academics & Languages",
            "Music", "Business", "Fine Art"));

    public static List<String> expectedCategories = new ArrayList<>(Arrays.asList("Academics & Languages",
            "Business", "Design", "Fine Art", "Health & Fitness", "Lifestyle", "Marketing", "Music",
            "Personal Development", "Photography", "Technology"));

    public static List<String> expectedSubsForAcademicsLanguages = new ArrayList<>(Arrays.asList("Academics",
            "Arabic", "Chinese", "English", "Exam Preparation", "French", "German", "Italian", "Japanese",
            "Korean", "Russian", "Sign Language", "Spanish", "Other"));

    public static List<String> expectedSubsForBusiness = new ArrayList<>(Arrays.asList("Business Law",
            "Data and Analytics", "Finance", "Management", "Real Estate", "Sales", "Strategy", "Other"));

    public static List<String> expectedSubsForDesign = new ArrayList<>(Arrays.asList("3D Animation",
            "Fashion Design", "Interior Design", "Web Design", "Other"));

    public static List<String> expectedSubsForFineArt = new ArrayList<>(Arrays.asList("Other"));

    public static List<String> expectedSubsForHealthFitness = new ArrayList<>(Arrays.asList("Fitness",
            "Hypnotherapy", "Meditation", "Nutrition", "Yoga", "Other"));

    public static List<String> expectedSubsForLifestyle = new ArrayList<>(Arrays.asList("Arts and Crafts",
            "Cooking and Beverages", "Dancing", "Home Improvement", "Pets and Training", "Travel",
            "Other"));

    public static List<String> expectedSubsForMarketing = new ArrayList<>(Arrays.asList("Advertising",
            "Branding", "Digital Marketing", "Mobile Marketing", "PR", "SMM", "Other"));

    public static List<String> expectedSubsForMusic = new ArrayList<>(Arrays.asList("Instruments",
            "Music Fundamentals", "Music Software", "Production", "Vocal", "Other"));

    public static List<String> expectedSubsForPersonalDevelopment = new ArrayList<>(Arrays.asList("Coaching",
            "Leadership", "Mental Health", "Motivation", "Personal Brand Building", "Productivity",
            "Other"));

    public static List<String> expectedSubsForPhotography = new ArrayList<>(Arrays.asList("Commercial Photography",
            "Digital Photography", "Photography Tools", "Video Design", "Other"));

    public static List<String> expectedSubsForTechnology = new ArrayList<>(Arrays.asList("Cyber Security",
            "Data Science", "Game Development", "Mobile Apps", "Programming Languages", "Web Development", "Other"));

    public static List<String> expectedHourlyRates = new ArrayList<>(Arrays.asList("Tier 1\n" +
                    "$5 per hour", "Tier 2\n" + "$7.5 per hour", "Tier 3\n" + "$10 per hour", "Tier 4\n" + "$12.5 per hour",
            "Tier 5\n" + "$15 per hour", "Tier 6\n" + "$17.5 per hour", "Tier 7\n" + "$20 per hour",
            "Tier 8\n" + "$22.5 per hour", "Tier 9\n" + "$25 per hour", "Tier 10\n" + "$27.5 per hour",
            "Tier 11\n" + "$30 per hour", "Tier 12\n" + "$35 per hour", "Tier 13\n" + "$40 per hour",
            "Tier 14\n" + "$45 per hour", "Tier 15\n" + "$50 per hour", "Tier 16\n" + "$55 per hour",
            "Tier 17\n" + "$60 per hour", "Tier 18\n" + "$65 per hour", "Tier 19\n" + "$70 per hour",
            "Tier 20\n" + "$75 per hour", "Tier 21\n" + "$80 per hour", "Tier 22\n" + "$85 per hour",
            "Tier 23\n" + "$90 per hour", "Tier 24\n" + "$95 per hour", "Tier 25\n" + "$100 per hour",
            "Tier 26\n" + "$110 per hour", "Tier 27\n" + "$120 per hour", "Tier 28\n" + "$130 per hour",
            "Tier 29\n" + "$140 per hour", "Tier 30\n" + "$150 per hour", "Tier 31\n" + "$160 per hour",
            "Tier 32\n" + "$170 per hour", "Tier 33\n" + "$180 per hour", "Tier 34\n" + "$190 per hour",
            "Tier 35\n" + "$200 per hour", "Tier 36\n" + "$210 per hour", "Tier 37\n" + "$220 per hour",
            "Tier 38\n" + "$230 per hour", "Tier 39\n" + "$240 per hour", "Tier 40\n" + "$250 per hour",
            "Tier 41\n" + "$260 per hour", "Tier 42\n" + "$270 per hour", "Tier 43\n" + "$280 per hour",
            "Tier 44\n" + "$290 per hour", "Tier 45\n" + "$300 per hour", "Tier 46\n" + "$320 per hour",
            "Tier 47\n" + "$340 per hour", "Tier 48\n" + "$360 per hour", "Tier 49\n" + "$380 per hour",
            "Tier 50\n" + "$400 per hour"));

    public static List<String> expectedTimeZones = new ArrayList<>(Arrays.asList("UTC+00 (Africa/Abidjan)",
            "UTC+00 (Africa/Accra)", "UTC+00 (Africa/Bamako)", "UTC+00 (Africa/Banjul)", "UTC+00 (Africa/Bissau)",
            "UTC+00 (Africa/Conakry)", "UTC+00 (Africa/Dakar)", "UTC+00 (Africa/Freetown)", "UTC+00 (Africa/Lome)",
            "UTC+00 (Africa/Monrovia)", "UTC+00 (Africa/Nouakchott)", "UTC+00 (Africa/Ouagadougou)",
            "UTC+00 (Africa/Sao_Tome)", "UTC+00 (Africa/Timbuktu)", "UTC+00 (America/Danmarkshavn)",
            "UTC+00 (America/Scoresbysund)", "UTC+00 (Atlantic/Azores)", "UTC+00 (Atlantic/Reykjavik)",
            "UTC+00 (Atlantic/St_Helena)", "UTC+00 (Etc/Greenwich)", "UTC+00 (Etc/UCT)", "UTC+00 (Etc/UTC)",
            "UTC+00 (Etc/Universal)", "UTC+00 (Etc/Zulu)", "UTC+00 (GMT)", "UTC+00 (GMT+0)", "UTC+00 (GMT-0)",
            "UTC+00 (GMT0)", "UTC+00 (Greenwich)", "UTC+00 (Iceland)", "UTC+00 (UCT)", "UTC+00 (UTC)", "UTC+00 (Universal)",
            "UTC+00 (Zulu)", "UTC+01 (Africa/Algiers)", "UTC+01 (Africa/Bangui)", "UTC+01 (Africa/Brazzaville)",
            "UTC+01 (Africa/Casablanca)", "UTC+01 (Africa/Douala)", "UTC+01 (Africa/El_Aaiun)", "UTC+01 (Africa/Kinshasa)",
            "UTC+01 (Africa/Lagos)", "UTC+01 (Africa/Libreville)", "UTC+01 (Africa/Luanda)", "UTC+01 (Africa/Malabo)",
            "UTC+01 (Africa/Ndjamena)", "UTC+01 (Africa/Niamey)", "UTC+01 (Africa/Porto-Novo)", "UTC+01 (Africa/Tunis)",
            "UTC+01 (Atlantic/Canary)", "UTC+01 (Atlantic/Faeroe)", "UTC+01 (Atlantic/Faroe)", "UTC+01 (Atlantic/Madeira)",
            "UTC+01 (Eire)", "UTC+01 (Europe/Belfast)", "UTC+01 (Europe/Dublin)", "UTC+01 (Europe/Guernsey)",
            "UTC+01 (Europe/Isle_of_Man)", "UTC+01 (Europe/Jersey)", "UTC+01 (Europe/Lisbon)", "UTC+01 (Europe/London)",
            "UTC+01 (GB)", "UTC+01 (GB-Eire)", "UTC+01 (Portugal)", "UTC+01 (WET)", "UTC+02 (Africa/Blantyre)",
            "UTC+02 (Africa/Bujumbura)", "UTC+02 (Africa/Cairo)", "UTC+02 (Africa/Ceuta)", "UTC+02 (Africa/Gaborone)",
            "UTC+02 (Africa/Harare)", "UTC+02 (Africa/Johannesburg)", "UTC+02 (Africa/Khartoum)", "UTC+02 (Africa/Kigali)",
            "UTC+02 (Africa/Lubumbashi)", "UTC+02 (Africa/Lusaka)", "UTC+02 (Africa/Maputo)", "UTC+02 (Africa/Maseru)",
            "UTC+02 (Africa/Mbabane)", "UTC+02 (Africa/Tripoli)", "UTC+02 (Africa/Windhoek)", "UTC+02 (Antarctica/Troll)",
            "UTC+02 (Arctic/Longyearbyen)", "UTC+02 (Atlantic/Jan_Mayen)", "UTC+02 (CET)", "UTC+02 (Egypt)",
            "UTC+02 (Europe/Amsterdam)", "UTC+02 (Europe/Andorra)", "UTC+02 (Europe/Belgrade)", "UTC+02 (Europe/Berlin)",
            "UTC+02 (Europe/Bratislava)", "UTC+02 (Europe/Brussels)", "UTC+02 (Europe/Budapest)", "UTC+02 (Europe/Busingen)",
            "UTC+02 (Europe/Copenhagen)", "UTC+02 (Europe/Gibraltar)", "UTC+02 (Europe/Kaliningrad)", "UTC+02 (Europe/Ljubljana)",
            "UTC+02 (Europe/Luxembourg)", "UTC+02 (Europe/Madrid)", "UTC+02 (Europe/Malta)", "UTC+02 (Europe/Monaco)",
            "UTC+02 (Europe/Oslo)", "UTC+02 (Europe/Paris)", "UTC+02 (Europe/Podgorica)", "UTC+02 (Europe/Prague)",
            "UTC+02 (Europe/Rome)", "UTC+02 (Europe/San_Marino)", "UTC+02 (Europe/Sarajevo)", "UTC+02 (Europe/Skopje)",
            "UTC+02 (Europe/Stockholm)", "UTC+02 (Europe/Tirane)", "UTC+02 (Europe/Vaduz)", "UTC+02 (Europe/Vatican)",
            "UTC+02 (Europe/Vienna)", "UTC+02 (Europe/Warsaw)", "UTC+02 (Europe/Zagreb)", "UTC+02 (Europe/Zurich)",
            "UTC+02 (Libya)", "UTC+02 (MET)", "UTC+02 (Poland)", "UTC+03 (Africa/Addis_Ababa)", "UTC+03 (Africa/Asmara)",
            "UTC+03 (Africa/Asmera)", "UTC+03 (Africa/Dar_es_Salaam)", "UTC+03 (Africa/Djibouti)", "UTC+03 (Africa/Juba)",
            "UTC+03 (Africa/Kampala)", "UTC+03 (Africa/Mogadishu)", "UTC+03 (Africa/Nairobi)", "UTC+03 (Antarctica/Syowa)",
            "UTC+03 (Asia/Aden)", "UTC+03 (Asia/Amman)", "UTC+03 (Asia/Baghdad)", "UTC+03 (Asia/Bahrain)",
            "UTC+03 (Asia/Beirut)", "UTC+03 (Asia/Damascus)", "UTC+03 (Asia/Famagusta)", "UTC+03 (Asia/Gaza)",
            "UTC+03 (Asia/Hebron)", "UTC+03 (Asia/Istanbul)", "UTC+03 (Asia/Jerusalem)", "UTC+03 (Asia/Kuwait)",
            "UTC+03 (Asia/Nicosia)", "UTC+03 (Asia/Qatar)", "UTC+03 (Asia/Riyadh)", "UTC+03 (Asia/Tehran)",
            "UTC+03 (Asia/Tel_Aviv)", "UTC+03 (EET)", "UTC+03 (Europe/Athens)", "UTC+03 (Europe/Bucharest)",
            "UTC+03 (Europe/Chisinau)", "UTC+03 (Europe/Helsinki)", "UTC+03 (Europe/Istanbul)", "UTC+03 (Europe/Kiev)",
            "UTC+03 (Europe/Kirov)", "UTC+03 (Europe/Mariehamn)", "UTC+03 (Europe/Minsk)", "UTC+03 (Europe/Moscow)",
            "UTC+03 (Europe/Nicosia)", "UTC+03 (Europe/Riga)", "UTC+03 (Europe/Simferopol)", "UTC+03 (Europe/Sofia)",
            "UTC+03 (Europe/Tallinn)", "UTC+03 (Europe/Tiraspol)", "UTC+03 (Europe/Uzhgorod)", "UTC+03 (Europe/Vilnius)",
            "UTC+03 (Europe/Zaporozhye)", "UTC+03 (Indian/Antananarivo)", "UTC+03 (Indian/Comoro)", "UTC+03 (Indian/Mayotte)",
            "UTC+03 (Iran)", "UTC+03 (Israel)", "UTC+03 (Turkey)", "UTC+03 (W-SU)", "UTC+04 (Asia/Baku)", "UTC+04 (Asia/Dubai)",
            "UTC+04 (Asia/Kabul)", "UTC+04 (Asia/Muscat)", "UTC+04 (Asia/Tbilisi)", "UTC+04 (Asia/Yerevan)",
            "UTC+04 (Europe/Astrakhan)", "UTC+04 (Europe/Samara)", "UTC+04 (Europe/Saratov)", "UTC+04 (Europe/Ulyanovsk)",
            "UTC+04 (Europe/Volgograd)", "UTC+04 (Indian/Mahe)", "UTC+04 (Indian/Mauritius)", "UTC+04 (Indian/Reunion)",
            "UTC+05 (Antarctica/Mawson)", "UTC+05 (Asia/Aqtau)", "UTC+05 (Asia/Aqtobe)", "UTC+05 (Asia/Ashgabat)",
            "UTC+05 (Asia/Ashkhabad)", "UTC+05 (Asia/Atyrau)", "UTC+05 (Asia/Calcutta)", "UTC+05 (Asia/Colombo)",
            "UTC+05 (Asia/Dushanbe)", "UTC+05 (Asia/Karachi)", "UTC+05 (Asia/Kathmandu)", "UTC+05 (Asia/Katmandu)",
            "UTC+05 (Asia/Kolkata)", "UTC+05 (Asia/Oral)", "UTC+05 (Asia/Qyzylorda)", "UTC+05 (Asia/Samarkand)",
            "UTC+05 (Asia/Tashkent)", "UTC+05 (Asia/Yekaterinburg)", "UTC+05 (Indian/Kerguelen)", "UTC+05 (Indian/Maldives)",
            "UTC+06 (Antarctica/Vostok)", "UTC+06 (Asia/Almaty)", "UTC+06 (Asia/Bishkek)", "UTC+06 (Asia/Dacca)",
            "UTC+06 (Asia/Dhaka)", "UTC+06 (Asia/Kashgar)", "UTC+06 (Asia/Omsk)", "UTC+06 (Asia/Qostanay)",
            "UTC+06 (Asia/Rangoon)", "UTC+06 (Asia/Thimbu)", "UTC+06 (Asia/Thimphu)", "UTC+06 (Asia/Urumqi)",
            "UTC+06 (Asia/Yangon)", "UTC+06 (Indian/Chagos)", "UTC+06 (Indian/Cocos)", "UTC+07 (Antarctica/Davis)",
            "UTC+07 (Asia/Bangkok)", "UTC+07 (Asia/Barnaul)", "UTC+07 (Asia/Ho_Chi_Minh)", "UTC+07 (Asia/Hovd)",
            "UTC+07 (Asia/Jakarta)", "UTC+07 (Asia/Krasnoyarsk)", "UTC+07 (Asia/Novokuznetsk)", "UTC+07 (Asia/Novosibirsk)",
            "UTC+07 (Asia/Phnom_Penh)", "UTC+07 (Asia/Pontianak)", "UTC+07 (Asia/Saigon)", "UTC+07 (Asia/Tomsk)", "UTC+07 (Asia/Vientiane)",
            "UTC+07 (Indian/Christmas)", "UTC+08 (Antarctica/Casey)", "UTC+08 (Asia/Brunei)", "UTC+08 (Asia/Choibalsan)",
            "UTC+08 (Asia/Chongqing)", "UTC+08 (Asia/Chungking)", "UTC+08 (Asia/Harbin)", "UTC+08 (Asia/Hong_Kong)",
            "UTC+08 (Asia/Irkutsk)", "UTC+08 (Asia/Kuala_Lumpur)", "UTC+08 (Asia/Kuching)", "UTC+08 (Asia/Macao)",
            "UTC+08 (Asia/Macau)", "UTC+08 (Asia/Makassar)", "UTC+08 (Asia/Manila)", "UTC+08 (Asia/Shanghai)",
            "UTC+08 (Asia/Singapore)", "UTC+08 (Asia/Taipei)", "UTC+08 (Asia/Ujung_Pandang)", "UTC+08 (Asia/Ulaanbaatar)",
            "UTC+08 (Asia/Ulan_Bator)", "UTC+08 (Australia/Eucla)", "UTC+08 (Australia/Perth)", "UTC+08 (Australia/West)",
            "UTC+08 (Hongkong)", "UTC+08 (PRC)", "UTC+08 (ROC)", "UTC+08 (Singapore)", "UTC+09 (Asia/Chita)",
            "UTC+09 (Asia/Dili)", "UTC+09 (Asia/Jayapura)", "UTC+09 (Asia/Khandyga)", "UTC+09 (Asia/Pyongyang)",
            "UTC+09 (Asia/Seoul)", "UTC+09 (Asia/Tokyo)", "UTC+09 (Asia/Yakutsk)", "UTC+09 (Australia/Darwin)",
            "UTC+09 (Australia/North)", "UTC+09 (Japan)", "UTC+09 (Pacific/Palau)", "UTC+09 (ROK)",
            "UTC+10 (Antarctica/DumontDUrville)", "UTC+10 (Asia/Ust-Nera)", "UTC+10 (Asia/Vladivostok)",
            "UTC+10 (Australia/Adelaide)", "UTC+10 (Australia/Brisbane)", "UTC+10 (Australia/Broken_Hill)",
            "UTC+10 (Australia/Lindeman)", "UTC+10 (Australia/Queensland)", "UTC+10 (Australia/South)",
            "UTC+10 (Australia/Yancowinna)", "UTC+10 (Pacific/Chuuk)", "UTC+10 (Pacific/Guam)", "UTC+10 (Pacific/Port_Moresby)",
            "UTC+10 (Pacific/Saipan)", "UTC+10 (Pacific/Truk)", "UTC+10 (Pacific/Yap)", "UTC+11 (Antarctica/Macquarie)",
            "UTC+11 (Asia/Magadan)", "UTC+11 (Asia/Sakhalin)", "UTC+11 (Asia/Srednekolymsk)", "UTC+11 (Australia/ACT)",
            "UTC+11 (Australia/Canberra)", "UTC+11 (Australia/Currie)", "UTC+11 (Australia/Hobart)", "UTC+11 (Australia/LHI)",
            "UTC+11 (Australia/Lord_Howe)", "UTC+11 (Australia/Melbourne)", "UTC+11 (Australia/NSW)", "UTC+11 (Australia/Sydney)",
            "UTC+11 (Australia/Tasmania)", "UTC+11 (Australia/Victoria)", "UTC+11 (Pacific/Bougainville)", "UTC+11 (Pacific/Efate)",
            "UTC+11 (Pacific/Guadalcanal)", "UTC+11 (Pacific/Kosrae)", "UTC+11 (Pacific/Noumea)", "UTC+11 (Pacific/Pohnpei)",
            "UTC+11 (Pacific/Ponape)", "UTC+12 (Asia/Anadyr)", "UTC+12 (Asia/Kamchatka)", "UTC+12 (Kwajalein)", "UTC+12 (Pacific/Fiji)",
            "UTC+12 (Pacific/Funafuti)", "UTC+12 (Pacific/Kwajalein)", "UTC+12 (Pacific/Majuro)", "UTC+12 (Pacific/Nauru)",
            "UTC+12 (Pacific/Norfolk)", "UTC+12 (Pacific/Tarawa)", "UTC+12 (Pacific/Wake)", "UTC+12 (Pacific/Wallis)",
            "UTC+13 (Antarctica/McMurdo)", "UTC+13 (Antarctica/South_Pole)", "UTC+13 (NZ)", "UTC+13 (NZ-CHAT)",
            "UTC+13 (Pacific/Auckland)", "UTC+13 (Pacific/Chatham)", "UTC+13 (Pacific/Enderbury)", "UTC+13 (Pacific/Fakaofo)",
            "UTC+13 (Pacific/Tongatapu)", "UTC+14 (Pacific/Apia)", "UTC+14 (Pacific/Kiritimati)", "UTC-01 (Atlantic/Cape_Verde)",
            "UTC-02 (America/Godthab)", "UTC-02 (America/Miquelon)", "UTC-02 (America/Noronha)", "UTC-02 (America/St_Johns)",
            "UTC-02 (Atlantic/South_Georgia)", "UTC-02 (Brazil/DeNoronha)", "UTC-02 (Canada/Newfoundland)", "UTC-03 (America/Araguaina)",
            "UTC-03 (America/Argentina/Buenos_Aires)", "UTC-03 (America/Argentina/Catamarca)", "UTC-03 (America/Argentina/ComodRivadavia)",
            "UTC-03 (America/Argentina/Cordoba)", "UTC-03 (America/Argentina/Jujuy)", "UTC-03 (America/Argentina/La_Rioja)",
            "UTC-03 (America/Argentina/Mendoza)", "UTC-03 (America/Argentina/Rio_Gallegos)", "UTC-03 (America/Argentina/Salta)",
            "UTC-03 (America/Argentina/San_Juan)", "UTC-03 (America/Argentina/San_Luis)", "UTC-03 (America/Argentina/Tucuman)",
            "UTC-03 (America/Argentina/Ushuaia)", "UTC-03 (America/Asuncion)", "UTC-03 (America/Bahia)", "UTC-03 (America/Belem)",
            "UTC-03 (America/Buenos_Aires)", "UTC-03 (America/Catamarca)", "UTC-03 (America/Cayenne)", "UTC-03 (America/Cordoba)",
            "UTC-03 (America/Fortaleza)", "UTC-03 (America/Glace_Bay)", "UTC-03 (America/Goose_Bay)", "UTC-03 (America/Halifax)",
            "UTC-03 (America/Jujuy)", "UTC-03 (America/Maceio)", "UTC-03 (America/Mendoza)", "UTC-03 (America/Moncton)",
            "UTC-03 (America/Montevideo)", "UTC-03 (America/Paramaribo)", "UTC-03 (America/Punta_Arenas)", "UTC-03 (America/Recife)",
            "UTC-03 (America/Rosario)", "UTC-03 (America/Santarem)", "UTC-03 (America/Santiago)", "UTC-03 (America/Sao_Paulo)",
            "UTC-03 (America/Thule)", "UTC-03 (Antarctica/Palmer)", "UTC-03 (Antarctica/Rothera)", "UTC-03 (Atlantic/Bermuda)",
            "UTC-03 (Atlantic/Stanley)", "UTC-03 (Brazil/East)", "UTC-03 (Canada/Atlantic)", "UTC-03 (Chile/Continental)",
            "UTC-04 (America/Anguilla)", "UTC-04 (America/Antigua)", "UTC-04 (America/Aruba)", "UTC-04 (America/Barbados)",
            "UTC-04 (America/Blanc-Sablon)", "UTC-04 (America/Boa_Vista)", "UTC-04 (America/Campo_Grande)", "UTC-04 (America/Caracas)",
            "UTC-04 (America/Cuiaba)", "UTC-04 (America/Curacao)", "UTC-04 (America/Detroit)", "UTC-04 (America/Dominica)",
            "UTC-04 (America/Fort_Wayne)", "UTC-04 (America/Grand_Turk)", "UTC-04 (America/Grenada)", "UTC-04 (America/Guadeloupe)",
            "UTC-04 (America/Guyana)", "UTC-04 (America/Havana)", "UTC-04 (America/Indiana/Indianapolis)", "UTC-04 (America/Indiana/Marengo)",
            "UTC-04 (America/Indiana/Petersburg)", "UTC-04 (America/Indiana/Vevay)", "UTC-04 (America/Indiana/Vincennes)",
            "UTC-04 (America/Indiana/Winamac)", "UTC-04 (America/Indianapolis)", "UTC-04 (America/Iqaluit)", "UTC-04 (America/Kentucky/Louisville)",
            "UTC-04 (America/Kentucky/Monticello)", "UTC-04 (America/Kralendijk)", "UTC-04 (America/La_Paz)", "UTC-04 (America/Louisville)",
            "UTC-04 (America/Lower_Princes)", "UTC-04 (America/Manaus)", "UTC-04 (America/Marigot)", "UTC-04 (America/Martinique)", "UTC-04 (America/Montreal)",
            "UTC-04 (America/Montserrat)", "UTC-04 (America/Nassau)", "UTC-04 (America/New_York)", "UTC-04 (America/Nipigon)",
            "UTC-04 (America/Pangnirtung)", "UTC-04 (America/Port-au-Prince)", "UTC-04 (America/Port_of_Spain)", "UTC-04 (America/Porto_Velho)",
            "UTC-04 (America/Puerto_Rico)", "UTC-04 (America/Santo_Domingo)", "UTC-04 (America/St_Barthelemy)", "UTC-04 (America/St_Kitts)",
            "UTC-04 (America/St_Lucia)", "UTC-04 (America/St_Thomas)", "UTC-04 (America/St_Vincent)", "UTC-04 (America/Thunder_Bay)",
            "UTC-04 (America/Toronto)", "UTC-04 (America/Tortola)", "UTC-04 (America/Virgin)", "UTC-04 (Brazil/West)", "UTC-04 (Canada/Eastern)",
            "UTC-04 (Cuba)", "UTC-04 (EST5EDT)", "UTC-04 (US/East-Indiana)", "UTC-04 (US/Eastern)", "UTC-04 (US/Michigan)",
            "UTC-05 (America/Atikokan)", "UTC-05 (America/Bahia_Banderas)", "UTC-05 (America/Bogota)", "UTC-05 (America/Cancun)",
            "UTC-05 (America/Cayman)", "UTC-05 (America/Chicago)", "UTC-05 (America/Coral_Harbour)", "UTC-05 (America/Eirunepe)",
            "UTC-05 (America/Guayaquil)", "UTC-05 (America/Indiana/Knox)", "UTC-05 (America/Indiana/Tell_City)", "UTC-05 (America/Jamaica)",
            "UTC-05 (America/Knox_IN)", "UTC-05 (America/Lima)", "UTC-05 (America/Matamoros)", "UTC-05 (America/Menominee)",
            "UTC-05 (America/Merida)", "UTC-05 (America/Mexico_City)", "UTC-05 (America/Monterrey)", "UTC-05 (America/North_Dakota/Beulah)",
            "UTC-05 (America/North_Dakota/Center)", "UTC-05 (America/North_Dakota/New_Salem)", "UTC-05 (America/Panama)",
            "UTC-05 (America/Porto_Acre)", "UTC-05 (America/Rainy_River)", "UTC-05 (America/Rankin_Inlet)",
            "UTC-05 (America/Resolute)", "UTC-05 (America/Rio_Branco)", "UTC-05 (America/Winnipeg)", "UTC-05 (Brazil/Acre)",
            "UTC-05 (CST6CDT)", "UTC-05 (Canada/Central)", "UTC-05 (Chile/EasterIsland)", "UTC-05 (EST)", "UTC-05 (Jamaica)",
            "UTC-05 (Mexico/General)", "UTC-05 (Pacific/Easter)", "UTC-05 (US/Central)", "UTC-05 (US/Indiana-Starke)",
            "UTC-06 (America/Belize)", "UTC-06 (America/Boise)", "UTC-06 (America/Cambridge_Bay)", "UTC-06 (America/Chihuahua)",
            "UTC-06 (America/Costa_Rica)", "UTC-06 (America/Denver)", "UTC-06 (America/Edmonton)", "UTC-06 (America/El_Salvador)",
            "UTC-06 (America/Guatemala)", "UTC-06 (America/Inuvik)", "UTC-06 (America/Managua)", "UTC-06 (America/Mazatlan)",
            "UTC-06 (America/Ojinaga)", "UTC-06 (America/Regina)", "UTC-06 (America/Shiprock)", "UTC-06 (America/Swift_Current)",
            "UTC-06 (America/Tegucigalpa)", "UTC-06 (America/Yellowknife)", "UTC-06 (Canada/Mountain)", "UTC-06 (Canada/Saskatchewan)",
            "UTC-06 (MST7MDT)", "UTC-06 (Mexico/BajaSur)", "UTC-06 (Navajo)", "UTC-06 (Pacific/Galapagos)", "UTC-06 (US/Mountain)",
            "UTC-07 (America/Creston)", "UTC-07 (America/Dawson)", "UTC-07 (America/Dawson_Creek)", "UTC-07 (America/Ensenada)",
            "UTC-07 (America/Fort_Nelson)", "UTC-07 (America/Hermosillo)", "UTC-07 (America/Los_Angeles)",
            "UTC-07 (America/Phoenix)", "UTC-07 (America/Santa_Isabel)", "UTC-07 (America/Tijuana)", "UTC-07 (America/Vancouver)",
            "UTC-07 (America/Whitehorse)", "UTC-07 (Canada/Pacific)", "UTC-07 (Canada/Yukon)", "UTC-07 (MST)",
            "UTC-07 (Mexico/BajaNorte)", "UTC-07 (PST8PDT)", "UTC-07 (US/Arizona)", "UTC-07 (US/Pacific)",
            "UTC-07 (US/Pacific-New)", "UTC-08 (America/Anchorage)", "UTC-08 (America/Juneau)", "UTC-08 (America/Metlakatla)",
            "UTC-08 (America/Nome)", "UTC-08 (America/Sitka)", "UTC-08 (America/Yakutat)", "UTC-08 (Pacific/Pitcairn)",
            "UTC-08 (US/Alaska)", "UTC-09 (America/Adak)", "UTC-09 (America/Atka)", "UTC-09 (Pacific/Gambier)",
            "UTC-09 (Pacific/Marquesas)", "UTC-09 (US/Aleutian)", "UTC-10 (HST)", "UTC-10 (Pacific/Honolulu)",
            "UTC-10 (Pacific/Johnston)", "UTC-10 (Pacific/Rarotonga)", "UTC-10 (Pacific/Tahiti)", "UTC-10 (US/Hawaii)",
            "UTC-11 (Pacific/Midway)", "UTC-11 (Pacific/Niue)", "UTC-11 (Pacific/Pago_Pago)", "UTC-11 (Pacific/Samoa)",
            "UTC-11 (US/Samoa)"));


}
