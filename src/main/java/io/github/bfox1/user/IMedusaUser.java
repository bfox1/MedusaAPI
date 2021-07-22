package io.github.bfox1.user;

import io.github.bfox1.utils.IActionResult;
import net.dv8tion.jda.api.entities.User;

public interface IMedusaUser
{
     String getUserID();

     User getMember();

     IActionResult<String> addPermission();

     IActionResult<String> hasPermission(String permNode);

     IActionResult<String> removePermission();

     IActionResult<String> removePermissionGroup();
}
