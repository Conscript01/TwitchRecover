/*
 * Copyright (c) 2020 Daylam Tayari <daylam@tayari.gg>
 *
 * This library is free software. You can redistribute it and/or modify it under the terms of the GNU General Public License version 3 as published by the Free Software Foundation.
 * This program is distributed in the that it will be use, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

/*
 * @author Daylam Tayari https://github.com/daylamtayari
 * @version 2.0
 * Github project home page: https://github.com/TwitchRecover
 * Twitch Recover repository: https://github.com/TwitchRecover/TwitchRecover
 */

package TwitchRecover.CLI;

import java.util.Scanner;

/**
 * This class holds all of the prompts
 * and the prompt handlers for the
 * CLI version of the program.
 */
public class Prompts {
    /**
     * This prints the welcome prompt.
     */
    protected static void welcome(){
        System.out.print(
                  "\nWelcome to Twitch Recover!"
                + "\nThe number one Twitch recovery tool created by Daylam Tayari (https://github.com/daylamtayari)"
                + "\nIf you like this tool please help support me: https://paypal.me/daylamtayari https://cash.app/$daylamtayari"
                + "\n"
        );
    }

    /**
     * This method prints the main menu
     * and returns the option the user selected.
     * @return int  Integer value representing the option that the user selected.
     */
    protected static int menu(){
        Scanner sc=new Scanner(System.in);
        menuPrinter();
        System.out.print("\nPlease enter the number of the option you want to select (number between 1-9 inclusive:\n");
        int input=Integer.parseInt(sc.nextLine());
        while(!(input>0 && input<10)){
            System.out.print(
                      "\n\nINCORRECT INPUT"
                    + "\nPLEASE ENTER THE NUMBER OF THE OPTION YOU WANT TO SELECT (number between 1-9 inclusive):\n"
            );
            input=Integer.parseInt(sc.nextLine());
        }
        sc.close();
        return input;
    }

    /**
     * This method prints the main menu options.
     */
    private static void menuPrinter(){
        System.out.print(
                  "\n\nMenu:"
                + "\nVODs:"
                + "\n1. Download a VOD."
                + "\n2. Download a sub-only VOD (without being subbed to that channel)."
                + "\n3. Recover a VOD - 60 days maximum."
                + "\n4. View a muted M3U8 VOD - If a M3U8 VOD has muted segments, use this to view it in its entirety."
                + "\nHighlights:"
                + "\n5. Download a highlight."
                + "\n6. Recover a highlight."
                + "\nClips:"
                + "\n7. Download a clip."
                + "\n8. Recover all clips from a stream - NO time limit."
                + "\n9. Mass recover options:"
        );
    }

    /**
     * This method retrieves the user's selected option for
     * the mass recovery/download features.
     * @return int  Integer value representing the user's selected option for the mass recovery/download feature.
     */
    protected static int massOptions(){
        Scanner sc=new Scanner(System.in);
        massMenu();
        System.out.print("\nPlease enter the number of the option you want to select (number between 1-5 inclusive):\n");
        int input=Integer.parseInt(sc.nextLine());
        while(!(input>0 && input<6)){
            System.out.print(
                      "\n\nINCORRECT INPUT"
                    + "\nPLEASE ENTER THE NUMBER OF THE OPTION YOU WANT TO SELECT (number between 1-5 inclusive):\n"
            );
        }
        sc.close();
        return input;
    }

    /**
     * This method prints the menu of
     * the masss recovery/download options.
     */
    private static void massMenu(){
        System.out.print(
                  "\n\nMass recover allows for the mass recovery or downloads of a specific option."
                + "\nThe source of all of the links to recover/download must all be in the same file."
                + "\nMass recovery options:"
                + "\n1. Mass download VODs."
                + "\n2. Mass recover VODs."
                + "\n3. Mass download highlights."
                + "\n4. Mass recover highlights."
                + "\n5. Mass download clips."
        );
    }

    /**
     * Method which retrieves the file
     * path of the location for where
     * the file with all of the URLs for
     * the mass recovery/download options.
     * @return String   String value representing the file path of the location of the source file.
     */
    protected static String getMassFP(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\nPlease enter the complete file path of the location of the file containing all of the URLs:\n");
        String fpInput=sc.nextLine();
        sc.close();
        return fpInput;
    }

    /**
     * This method retrieves the directory for
     * where to save the downloads in cases for
     * mass downloads.
     * @return String   String value representing the directory for where to save the file.
     */
    protected static String getMassDir(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\nPlease enter the directory where you want the downloaded files to be saved:\n");
        String dir=sc.nextLine();
        sc.close();
        return dir;
    }

    /**
     * Method that retrieves the output file path
     * and adjusts it if necessary.
     * @return String   String value representing the output file path.
     */
    protected static String getOutFP(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\nPlease enter the file path of the folder where you want the output file to be saved:\n");
        String fp=sc.nextLine();
        sc.close();
        return fp;
    }
}