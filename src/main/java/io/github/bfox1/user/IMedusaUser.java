package io.github.bfox1.user;

import io.github.bfox1.utils.IActionResult;
import net.dv8tion.jda.api.entities.User;

/**
 * Work in Progress. Unfinished.
 * The Design of Medusa User is to Store Data(Permissions and such) for the Bot
 *
 */
public interface IMedusaUser
{
     String getUserID();

     /**
      * This should not be accessible. Wrappers for Discord JDA Classes should be made for this
      * @return
      */
     @Deprecated
     User getMember();

     IActionResult<String> addPermission();

     IActionResult<String> hasPermission(String permNode);

     IActionResult<String> removePermission();

     IActionResult<String> removePermissionGroup();
}
