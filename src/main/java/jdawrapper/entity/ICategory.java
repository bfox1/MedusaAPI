package jdawrapper.entity;

import io.github.bfox1.utils.ActionResult;

import javax.annotation.Nonnull;
import java.util.List;

public interface ICategory extends IGenericInterface
{

    List<IGuildChannel> getChannels();

    List<ITextChannel> getTextChannels();

    List<IVoiceChannel> getVoiceChannels();

    ActionResult<ITextChannel> createTextChannel(@Nonnull String name);

    ActionResult<IVoiceChannel> createVoiceChannel(@Nonnull String name);


}
