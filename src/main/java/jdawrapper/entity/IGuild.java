package jdawrapper.entity;


import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.management.relation.Role;
import java.lang.reflect.Member;
import java.util.List;

public interface IGuild extends IGenericInterface
{
    //General Guild Methods//

    void addMember(String var1, String var2);

    boolean isLoaded();

    void pruneMemberCache();

    boolean unloadMember(long var1);

    int getMemberCount();

    String getIconId();

    String getDescription();

    int getBoostCount();

    List<Member> getBoosters();

    int getMaxMembers();

    IVoiceChannel getAfkChannel();

    ITextChannel getSystemChannel();

    IMember getOwner();

    long getOwnerIdLong();

    default String getOwnerId()
    {
        return Long.toUnsignedString(this.getOwnerIdLong());
    }

    // Guild Member Methods //

    boolean isMember(IUser user);

    Member getMember(IUser user);

    Member getMemberById(String userId);

    Member getMemberById(long userId);

    List<Member> getMembers();

    List<Member> getMembersWithRole(IRole... roles);

    // Guild Channel Methods //

    IGuildChannel getGuildChannelById(String id);

    IGuildChannel getGuildChannelById(long id);

    ICategory getCategoryById(String id);

    ICategory getCategoryById(long id);

    List<ICategory> getCategories();

    // Guild TextChannel Methods //

    ITextChannel getTextChannelById(@Nonnull String id);

    ITextChannel getTextChannelById(long id);

    List<ITextChannel> getTextChannels();

    List<ITextChannel> getTextChannelsByName(String name, boolean ignoreCase);

    // Guild VoiceChannel Methods //

    IVoiceChannel getVoiceChannelById(@Nonnull String id);

    IVoiceChannel getVoiceChannelById(long id);

    List<IVoiceChannel> getVoiceChannels();

    List<IVoiceChannel> getVoiceChannelsByName(@Nonnull String name, boolean ignoreCase);

    // Guild Role Methods //

    IRole getRoleById(@Nonnull String id);

    IRole getRoleById(long id);

    List<IRole> getRoles();

    List<Role> getRolesByName(@Nonnull String name, boolean ignoreCase);

    // Guild Emote Methods //

    IEmote getEmoteById(@Nonnull String name);

    IEmote getEmoteById(long id);

    List<IEmote> getEmotes();

    void addRoleToMember(@Nonnull IMember member, @Nonnull IRole role);

    void addRoleToMember(long id, @Nonnull IRole role);

    void removeRoleFromMember(@Nonnull Member member, @Nonnull IRole role);

    void removeRoleFromMember(long id, @Nonnull IRole role);


}
