package jdawrapper.entity;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IMessage
{

    List<IUser> getMentionedUsers();

    List<ITextChannel> getMentionedChannels();

    List<IRole> getMentionedRoles();

    List<IMember> getMentionedMembers();

    boolean isEdited();

    IUser getAuthor();

    IMember getMember();

    String getJumpUrl();

    String getContentDisplay();

    String getContentRaw();

    String getContentStripped();

    List<String> getInvites();

    IMessageChannel getChannel();

    IPrivateChannel getPrivateChannel();

    ITextChannel getTextChannel();

    IGuild getGuild();

    List<IMessage.IAttachment> getAttachments();

    List<IMessageEmbed> getEmbeds();


    interface IAttachment
    {
        /**
         * Returns the Id of the Attachment.
         * @return The Long ID
         */
        long getIdLong();

        /**
         * Gets the URL where it is Located.
         * @return The URl
         */
        String getUrl();

        /**
         *
         * @return //
         */
        String getProxyUrl();

        /**
         * Returns the File name.
         * @return The File name.
         */
        String getFileName();

        /**
         * Simply returns the File Extension.
         * @return String
         */
        String getFileExtension();

        CompletableFuture<InputStream> retrieveInputStream();

        CompletableFuture<File> downloadToFile();

        CompletableFuture<File> downloadToFile(String path);

        int getSize();

        int getHeight();

        int getWidth();

        boolean isImage();

        boolean isVideo();

        boolean isSpoiler();
    }
}
