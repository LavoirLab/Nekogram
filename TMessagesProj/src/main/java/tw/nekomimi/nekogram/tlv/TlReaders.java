package tw.nekomimi.nekogram.tlv;

import com.google.gson.JsonObject;

import org.telegram.tgnet.TLObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public final class TlReaders {

    public static final int LAYER = 227;
    public static final Map<Integer, Function<TlBinaryReader, JsonObject>>
            READERS = new HashMap<>();

    static {
        READERS.put(0x1fad68cd, TlReaders::readChannelAdminLogEvent);
        READERS.put(0x5806b4ec, TlReaders::readChannelAdminLogEventActionParticipantEditRank);
        READERS.put(0xc517f77e, TlReaders::readChannelAdminLogEventActionToggleAutotranslation);
        READERS.put(0x64642db3, TlReaders::readChannelAdminLogEventActionParticipantSubExtend);
        READERS.put(0x1b03f006, TlReaders::readChannelParticipantLeft);
        READERS.put(0xa2a5371e, TlReaders::readPeerChannel);
        READERS.put(0x36c6019a, TlReaders::readPeerChat);
        READERS.put(0x59511722, TlReaders::readPeerUser);
        READERS.put(0xd5f0ad91, TlReaders::readChannelParticipantBanned);
        READERS.put(0x9f120418, TlReaders::readChatBannedRights);
        READERS.put(0x34c3bb53, TlReaders::readChannelParticipantAdmin);
        READERS.put(0x5fb224d5, TlReaders::readChatAdminRights);
        READERS.put(0x2fe601d3, TlReaders::readChannelParticipantCreator);
        READERS.put(0xa9478a1a, TlReaders::readChannelParticipantSelf);
        READERS.put(0x1bd54456, TlReaders::readChannelParticipant);
        READERS.put(0x60a79c79, TlReaders::readChannelAdminLogEventActionToggleSignatureProfiles);
        READERS.put(0x46d840ab, TlReaders::readChannelAdminLogEventActionChangeEmojiStickerSet);
        READERS.put(0x1cf671a0, TlReaders::readInputStickerSetTonGifts);
        READERS.put(0x49748553, TlReaders::readInputStickerSetEmojiChannelDefaultStatuses);
        READERS.put(0x44c1f8e9, TlReaders::readInputStickerSetEmojiDefaultTopicIcons);
        READERS.put(0x29d0f5ee, TlReaders::readInputStickerSetEmojiDefaultStatuses);
        READERS.put(0x4c4d4ce, TlReaders::readInputStickerSetEmojiGenericAnimations);
        READERS.put(0xc88b3b02, TlReaders::readInputStickerSetPremiumGifts);
        READERS.put(0xcde3739, TlReaders::readInputStickerSetAnimatedEmojiAnimations);
        READERS.put(0xe67f520e, TlReaders::readInputStickerSetDice);
        READERS.put(0x28703c8, TlReaders::readInputStickerSetAnimatedEmoji);
        READERS.put(0x861cc8a0, TlReaders::readInputStickerSetShortName);
        READERS.put(0x9de7a269, TlReaders::readInputStickerSetID);
        READERS.put(0xffb62b95, TlReaders::readInputStickerSetEmpty);
        READERS.put(0x3ea9feb1, TlReaders::readChannelAdminLogEventActionChangeEmojiStatus);
        READERS.put(0x7141dbf, TlReaders::readInputEmojiStatusCollectible);
        READERS.put(0x7184603b, TlReaders::readEmojiStatusCollectible);
        READERS.put(0xe7ff068a, TlReaders::readEmojiStatus);
        READERS.put(0x2de11aae, TlReaders::readEmojiStatusEmpty);
        READERS.put(0x31bb5d52, TlReaders::readChannelAdminLogEventActionChangeWallpaper);
        READERS.put(0xe0804116, TlReaders::readWallPaperNoFile);
        READERS.put(0x372efcd0, TlReaders::readWallPaperSettings);
        READERS.put(0xa437c3ed, TlReaders::readWallPaper);
        READERS.put(0x8fd4c4d8, TlReaders::readDocument);
        READERS.put(0xfd149899, TlReaders::readDocumentAttributeCustomEmoji);
        READERS.put(0x9801d2f7, TlReaders::readDocumentAttributeHasStickers);
        READERS.put(0x15590068, TlReaders::readDocumentAttributeFilename);
        READERS.put(0x9852f9c6, TlReaders::readDocumentAttributeAudio);
        READERS.put(0x43c57c48, TlReaders::readDocumentAttributeVideo);
        READERS.put(0x6319d612, TlReaders::readDocumentAttributeSticker);
        READERS.put(0xaed6dbb2, TlReaders::readMaskCoords);
        READERS.put(0x11b58939, TlReaders::readDocumentAttributeAnimated);
        READERS.put(0x6c37c15c, TlReaders::readDocumentAttributeImageSize);
        READERS.put(0xda082fe, TlReaders::readVideoSizeStickerMarkup);
        READERS.put(0xf85c413c, TlReaders::readVideoSizeEmojiMarkup);
        READERS.put(0xde33b094, TlReaders::readVideoSize);
        READERS.put(0xd8214d41, TlReaders::readPhotoPathSize);
        READERS.put(0xfa3efb95, TlReaders::readPhotoSizeProgressive);
        READERS.put(0xe0b0bc2e, TlReaders::readPhotoStrippedSize);
        READERS.put(0x21e1ad6, TlReaders::readPhotoCachedSize);
        READERS.put(0x75c78e60, TlReaders::readPhotoSize);
        READERS.put(0xe17e23c, TlReaders::readPhotoSizeEmpty);
        READERS.put(0x36f8c871, TlReaders::readDocumentEmpty);
        READERS.put(0x5e477b25, TlReaders::readChannelAdminLogEventActionChangeProfilePeerColor);
        READERS.put(0xb8ea86a9, TlReaders::readInputPeerColorCollectible);
        READERS.put(0xb9c0639a, TlReaders::readPeerColorCollectible);
        READERS.put(0xb54b5acf, TlReaders::readPeerColor);
        READERS.put(0x5796e780, TlReaders::readChannelAdminLogEventActionChangePeerColor);
        READERS.put(0x64f36dfc, TlReaders::readChannelAdminLogEventActionToggleAntiSpam);
        READERS.put(0x5d8d353b, TlReaders::readChannelAdminLogEventActionPinTopic);
        READERS.put(0xfcdad815, TlReaders::readForumTopic);
        READERS.put(0x60fe3294, TlReaders::readDraftMessage);
        READERS.put(0xbaf39d8b, TlReaders::readRichMessage);
        READERS.put(0xfb197a65, TlReaders::readPhoto);
        READERS.put(0x2331b22d, TlReaders::readPhotoEmpty);
        READERS.put(0xe6e47c4, TlReaders::readPageBlockBlockquoteBlocks);
        READERS.put(0xa5b45e2b, TlReaders::readTextDate);
        READERS.put(0x1a9fbfc, TlReaders::readTextMentionName);
        READERS.put(0xb956812d, TlReaders::readTextBankCard);
        READERS.put(0x24c26789, TlReaders::readTextAutoPhone);
        READERS.put(0xc556a45d, TlReaders::readTextAutoEmail);
        READERS.put(0xac6a83aa, TlReaders::readTextAutoUrl);
        READERS.put(0x7b9e1801, TlReaders::readTextCashtag);
        READERS.put(0x2ff29d3, TlReaders::readTextBotCommand);
        READERS.put(0x519524ea, TlReaders::readTextHashtag);
        READERS.put(0xcd24cf44, TlReaders::readTextMention);
        READERS.put(0x4c2a5d62, TlReaders::readTextSpoiler);
        READERS.put(0xa26156c0, TlReaders::readTextCustomEmoji);
        READERS.put(0x9d2eac97, TlReaders::readTextMath);
        READERS.put(0x35553762, TlReaders::readTextAnchor);
        READERS.put(0x81ccf4f, TlReaders::readTextImage);
        READERS.put(0x1ccb966a, TlReaders::readTextPhone);
        READERS.put(0x34b8621, TlReaders::readTextMarked);
        READERS.put(0xc7fb5e01, TlReaders::readTextSuperscript);
        READERS.put(0xed6a8504, TlReaders::readTextSubscript);
        READERS.put(0x7e6260d7, TlReaders::readTextConcat);
        READERS.put(0xde5a0dd6, TlReaders::readTextEmail);
        READERS.put(0x3c2884c1, TlReaders::readTextUrl);
        READERS.put(0x6c3f19b9, TlReaders::readTextFixed);
        READERS.put(0x9bf8bb95, TlReaders::readTextStrike);
        READERS.put(0xc12622c4, TlReaders::readTextUnderline);
        READERS.put(0xd912a59c, TlReaders::readTextItalic);
        READERS.put(0x6724abc4, TlReaders::readTextBold);
        READERS.put(0x744694e0, TlReaders::readTextPlain);
        READERS.put(0xdc3d824f, TlReaders::readTextEmpty);
        READERS.put(0x574b617f, TlReaders::readInputPageBlockMap);
        READERS.put(0x6f747657, TlReaders::readPageCaption);
        READERS.put(0x48222faf, TlReaders::readInputGeoPoint);
        READERS.put(0xe4c123d6, TlReaders::readInputGeoPointEmpty);
        READERS.put(0x3c29a3e2, TlReaders::readPageBlockThinking);
        READERS.put(0x59080c20, TlReaders::readPageBlockMath);
        READERS.put(0x682a41a9, TlReaders::readPageBlockHeading6);
        READERS.put(0xdbbe6c6a, TlReaders::readPageBlockHeading5);
        READERS.put(0xb532772b, TlReaders::readPageBlockHeading4);
        READERS.put(0x67e731ad, TlReaders::readPageBlockHeading3);
        READERS.put(0x96b2aec, TlReaders::readPageBlockHeading2);
        READERS.put(0xbaff072f, TlReaders::readPageBlockHeading1);
        READERS.put(0xa44f3ef6, TlReaders::readPageBlockMap);
        READERS.put(0xb2a2f663, TlReaders::readGeoPoint);
        READERS.put(0x1117dd5f, TlReaders::readGeoPointEmpty);
        READERS.put(0x16115a96, TlReaders::readPageBlockRelatedArticles);
        READERS.put(0xb390dc08, TlReaders::readPageRelatedArticle);
        READERS.put(0x76768bed, TlReaders::readPageBlockDetails);
        READERS.put(0x1fd6f6c1, TlReaders::readPageBlockOrderedList);
        READERS.put(0x8ff2d5f0, TlReaders::readPageListOrderedItemBlocks);
        READERS.put(0xbf4dea82, TlReaders::readPageBlockTable);
        READERS.put(0xe0c0c5e5, TlReaders::readPageTableRow);
        READERS.put(0x34566b6a, TlReaders::readPageTableCell);
        READERS.put(0x1e148390, TlReaders::readPageBlockKicker);
        READERS.put(0x804361ea, TlReaders::readPageBlockAudio);
        READERS.put(0xef1751b5, TlReaders::readPageBlockChannel);
        READERS.put(0x17d493d5, TlReaders::readChannelForbidden);
        READERS.put(0x1c32b11c, TlReaders::readChannel);
        READERS.put(0x711d692d, TlReaders::readRecentStory);
        READERS.put(0xb4073647, TlReaders::readUsername);
        READERS.put(0xd072acb4, TlReaders::readRestrictionReason);
        READERS.put(0x1c6e1c11, TlReaders::readChatPhoto);
        READERS.put(0x37c1011c, TlReaders::readChatPhotoEmpty);
        READERS.put(0x6592a1a7, TlReaders::readChatForbidden);
        READERS.put(0x41cbf256, TlReaders::readChat);
        READERS.put(0x5b934f9d, TlReaders::readInputChannelFromMessage);
        READERS.put(0xbd2a0840, TlReaders::readInputPeerChannelFromMessage);
        READERS.put(0xa87b0a1c, TlReaders::readInputPeerUserFromMessage);
        READERS.put(0x27bcbbfc, TlReaders::readInputPeerChannel);
        READERS.put(0xdde8a54c, TlReaders::readInputPeerUser);
        READERS.put(0x35a95cb9, TlReaders::readInputPeerChat);
        READERS.put(0x7da07ec9, TlReaders::readInputPeerSelf);
        READERS.put(0x7f3b18ea, TlReaders::readInputPeerEmpty);
        READERS.put(0xf35aec28, TlReaders::readInputChannel);
        READERS.put(0xee8c1e86, TlReaders::readInputChannelEmpty);
        READERS.put(0x29562865, TlReaders::readChatEmpty);
        READERS.put(0x31f9590, TlReaders::readPageBlockSlideshow);
        READERS.put(0x65a0fa4d, TlReaders::readPageBlockCollage);
        READERS.put(0xf259a80b, TlReaders::readPageBlockEmbedPost);
        READERS.put(0xa8718dc5, TlReaders::readPageBlockEmbed);
        READERS.put(0x39f23300, TlReaders::readPageBlockCover);
        READERS.put(0x7c8fe7b6, TlReaders::readPageBlockVideo);
        READERS.put(0x1759c560, TlReaders::readPageBlockPhoto);
        READERS.put(0x4f4456d3, TlReaders::readPageBlockPullquote);
        READERS.put(0x263d7c26, TlReaders::readPageBlockBlockquote);
        READERS.put(0xe4e88011, TlReaders::readPageBlockList);
        READERS.put(0x63ca67aa, TlReaders::readPageListItemBlocks);
        READERS.put(0xce0d37b0, TlReaders::readPageBlockAnchor);
        READERS.put(0xdb20b188, TlReaders::readPageBlockDivider);
        READERS.put(0x48870999, TlReaders::readPageBlockFooter);
        READERS.put(0xc070d93e, TlReaders::readPageBlockPreformatted);
        READERS.put(0x467a0766, TlReaders::readPageBlockParagraph);
        READERS.put(0xf12bb6e1, TlReaders::readPageBlockSubheader);
        READERS.put(0xbfd064ec, TlReaders::readPageBlockHeader);
        READERS.put(0xbaafe5e0, TlReaders::readPageBlockAuthorDate);
        READERS.put(0x8ffa9a1f, TlReaders::readPageBlockSubtitle);
        READERS.put(0x70abc3fd, TlReaders::readPageBlockTitle);
        READERS.put(0x13567e8a, TlReaders::readPageBlockUnsupported);
        READERS.put(0x2f58683c, TlReaders::readPageListItemText);
        READERS.put(0x15031189, TlReaders::readPageListOrderedItemText);
        READERS.put(0xe8e37e5, TlReaders::readSuggestedPost);
        READERS.put(0x74aee3e0, TlReaders::readStarsTonAmount);
        READERS.put(0xbbb6b4a3, TlReaders::readStarsAmount);
        READERS.put(0xf3a9244a, TlReaders::readInputMediaStakeDice);
        READERS.put(0x9fc55fde, TlReaders::readInputMediaTodo);
        READERS.put(0x49b92a26, TlReaders::readTodoList);
        READERS.put(0xcba9a52f, TlReaders::readTodoItem);
        READERS.put(0x751f3146, TlReaders::readTextWithEntities);
        READERS.put(0x652c1c5, TlReaders::readMessageEntityDiffDelete);
        READERS.put(0xc6c1e5a7, TlReaders::readMessageEntityDiffReplace);
        READERS.put(0x71777116, TlReaders::readMessageEntityDiffInsert);
        READERS.put(0x904ac7c7, TlReaders::readMessageEntityFormattedDate);
        READERS.put(0xf1ccaaac, TlReaders::readMessageEntityBlockquote);
        READERS.put(0xc8cf05f8, TlReaders::readMessageEntityCustomEmoji);
        READERS.put(0x32ca960f, TlReaders::readMessageEntitySpoiler);
        READERS.put(0x761e6af4, TlReaders::readMessageEntityBankCard);
        READERS.put(0xbf0693d4, TlReaders::readMessageEntityStrike);
        READERS.put(0x9c4e7e8b, TlReaders::readMessageEntityUnderline);
        READERS.put(0x4c4e743f, TlReaders::readMessageEntityCashtag);
        READERS.put(0x9b69e34b, TlReaders::readMessageEntityPhone);
        READERS.put(0x208e68c9, TlReaders::readInputMessageEntityMentionName);
        READERS.put(0x1da448e2, TlReaders::readInputUserFromMessage);
        READERS.put(0xf21158c6, TlReaders::readInputUser);
        READERS.put(0xf7c1b13f, TlReaders::readInputUserSelf);
        READERS.put(0xb98886cf, TlReaders::readInputUserEmpty);
        READERS.put(0xdc7b1140, TlReaders::readMessageEntityMentionName);
        READERS.put(0x76a6d327, TlReaders::readMessageEntityTextUrl);
        READERS.put(0x73924be0, TlReaders::readMessageEntityPre);
        READERS.put(0x28a20571, TlReaders::readMessageEntityCode);
        READERS.put(0x826f8b60, TlReaders::readMessageEntityItalic);
        READERS.put(0xbd610bc9, TlReaders::readMessageEntityBold);
        READERS.put(0x64e475c2, TlReaders::readMessageEntityEmail);
        READERS.put(0x6ed02538, TlReaders::readMessageEntityUrl);
        READERS.put(0x6cef8ac7, TlReaders::readMessageEntityBotCommand);
        READERS.put(0x6f635b0d, TlReaders::readMessageEntityHashtag);
        READERS.put(0xfa04579d, TlReaders::readMessageEntityMention);
        READERS.put(0xbb92ba95, TlReaders::readMessageEntityUnknown);
        READERS.put(0xc4103386, TlReaders::readInputMediaPaidMedia);
        READERS.put(0xc21b8849, TlReaders::readInputMediaWebPage);
        READERS.put(0x89fdd778, TlReaders::readInputMediaStory);
        READERS.put(0xe66fbf7b, TlReaders::readInputMediaDice);
        READERS.put(0x883a4108, TlReaders::readInputMediaPoll);
        READERS.put(0x971fa843, TlReaders::readInputMediaGeoLive);
        READERS.put(0x405fef0d, TlReaders::readInputMediaInvoice);
        READERS.put(0xd33f43f3, TlReaders::readInputMediaGame);
        READERS.put(0xc331e80a, TlReaders::readInputGameShortName);
        READERS.put(0x32c3e77, TlReaders::readInputGameID);
        READERS.put(0x779600f9, TlReaders::readInputMediaDocumentExternal);
        READERS.put(0x3bb3b94a, TlReaders::readInputPhoto);
        READERS.put(0x1cd7bf0d, TlReaders::readInputPhotoEmpty);
        READERS.put(0xe5bbfe1a, TlReaders::readInputMediaPhotoExternal);
        READERS.put(0xc13d1c11, TlReaders::readInputMediaVenue);
        READERS.put(0xa8763ab5, TlReaders::readInputMediaDocument);
        READERS.put(0x1abfb575, TlReaders::readInputDocument);
        READERS.put(0x72f0eaae, TlReaders::readInputDocumentEmpty);
        READERS.put(0x37c9330, TlReaders::readInputMediaUploadedDocument);
        READERS.put(0x62dc8b48, TlReaders::readInputFileStoryDocument);
        READERS.put(0xfa4f0bb5, TlReaders::readInputFileBig);
        READERS.put(0xf52ff27f, TlReaders::readInputFile);
        READERS.put(0xf8ab7dfb, TlReaders::readInputMediaContact);
        READERS.put(0xf9c44144, TlReaders::readInputMediaGeoPoint);
        READERS.put(0xe3af4434, TlReaders::readInputMediaPhoto);
        READERS.put(0x7d8375da, TlReaders::readInputMediaUploadedPhoto);
        READERS.put(0x9664f57f, TlReaders::readInputMediaEmpty);
        READERS.put(0x7d748d04, TlReaders::readDataJSON);
        READERS.put(0x49ee584, TlReaders::readInvoice);
        READERS.put(0xcb296bf8, TlReaders::readLabeledPrice);
        READERS.put(0x9bed434d, TlReaders::readInputWebDocument);
        READERS.put(0x966e2dbf, TlReaders::readPoll);
        READERS.put(0x199fed96, TlReaders::readInputPollAnswer);
        READERS.put(0x4b7d786a, TlReaders::readPollAnswer);
        READERS.put(0xca5cab89, TlReaders::readMessageMediaVideoStream);
        READERS.put(0x8c10603f, TlReaders::readInputGroupCallInviteMessage);
        READERS.put(0xfe06823f, TlReaders::readInputGroupCallSlug);
        READERS.put(0xd8aa840f, TlReaders::readInputGroupCall);
        READERS.put(0x8a53b014, TlReaders::readMessageMediaToDo);
        READERS.put(0x221bb5e4, TlReaders::readTodoCompletion);
        READERS.put(0xa8852491, TlReaders::readMessageMediaPaidMedia);
        READERS.put(0xee479c64, TlReaders::readMessageExtendedMedia);
        READERS.put(0xceaa3ea1, TlReaders::readMessageMediaGiveawayResults);
        READERS.put(0xaa073beb, TlReaders::readMessageMediaGiveaway);
        READERS.put(0x68cb6283, TlReaders::readMessageMediaStory);
        READERS.put(0x16a4b93c, TlReaders::readStoryItem);
        READERS.put(0x523da4eb, TlReaders::readReactionPaid);
        READERS.put(0x8935fc73, TlReaders::readReactionCustomEmoji);
        READERS.put(0x1b2286b8, TlReaders::readReactionEmoji);
        READERS.put(0x79f5d419, TlReaders::readReactionEmpty);
        READERS.put(0x8d595cd6, TlReaders::readStoryViews);
        READERS.put(0xa3d1cb80, TlReaders::readReactionCount);
        READERS.put(0xf6a5f82f, TlReaders::readPrivacyValueDisallowBots);
        READERS.put(0x21461b5d, TlReaders::readPrivacyValueAllowBots);
        READERS.put(0xece9814b, TlReaders::readPrivacyValueAllowPremium);
        READERS.put(0xf7e8d89b, TlReaders::readPrivacyValueAllowCloseFriends);
        READERS.put(0x41c87565, TlReaders::readPrivacyValueDisallowChatParticipants);
        READERS.put(0x6b134e8e, TlReaders::readPrivacyValueAllowChatParticipants);
        READERS.put(0xe4621141, TlReaders::readPrivacyValueDisallowUsers);
        READERS.put(0x8b73e763, TlReaders::readPrivacyValueDisallowAll);
        READERS.put(0xf888fa1a, TlReaders::readPrivacyValueDisallowContacts);
        READERS.put(0xb8905fb2, TlReaders::readPrivacyValueAllowUsers);
        READERS.put(0x65427b82, TlReaders::readPrivacyValueAllowAll);
        READERS.put(0xfffe1bac, TlReaders::readPrivacyValueAllowContacts);
        READERS.put(0x5787686d, TlReaders::readMediaAreaStarGift);
        READERS.put(0xcfc9e002, TlReaders::readMediaAreaCoordinates);
        READERS.put(0x49a6549c, TlReaders::readMediaAreaWeather);
        READERS.put(0x37381085, TlReaders::readMediaAreaUrl);
        READERS.put(0x2271f2bf, TlReaders::readInputMediaAreaChannelPost);
        READERS.put(0x770416af, TlReaders::readMediaAreaChannelPost);
        READERS.put(0x14455871, TlReaders::readMediaAreaSuggestedReaction);
        READERS.put(0xcad5452d, TlReaders::readMediaAreaGeoPoint);
        READERS.put(0xde4c5d93, TlReaders::readGeoPointAddress);
        READERS.put(0xb282217f, TlReaders::readInputMediaAreaVenue);
        READERS.put(0xbe82db9c, TlReaders::readMediaAreaVenue);
        READERS.put(0x8cbec07, TlReaders::readMessageMediaDice);
        READERS.put(0xda2ad647, TlReaders::readMessages_emojiGameOutcome);
        READERS.put(0x773f4e66, TlReaders::readMessageMediaPoll);
        READERS.put(0xb940c666, TlReaders::readMessageMediaGeoLive);
        READERS.put(0xf6a548d3, TlReaders::readMessageMediaInvoice);
        READERS.put(0xad628cc8, TlReaders::readMessageExtendedMediaPreview);
        READERS.put(0xf9c8bcc6, TlReaders::readWebDocumentNoProxy);
        READERS.put(0x1c570ed1, TlReaders::readWebDocument);
        READERS.put(0xfdb19008, TlReaders::readMessageMediaGame);
        READERS.put(0xbdf9653b, TlReaders::readGame);
        READERS.put(0x2ec0533f, TlReaders::readMessageMediaVenue);
        READERS.put(0xddf10c3b, TlReaders::readMessageMediaWebPage);
        READERS.put(0x7311ca11, TlReaders::readWebPageNotModified);
        READERS.put(0xe89c45b2, TlReaders::readWebPage);
        READERS.put(0x7781fe18, TlReaders::readWebPageAttributeAiComposeTone);
        READERS.put(0x1c641c2, TlReaders::readWebPageAttributeStarGiftAuction);
        READERS.put(0x85f0a9cd, TlReaders::readStarGiftUnique);
        READERS.put(0xe0bff26c, TlReaders::readStarGiftAttributeOriginalDetails);
        READERS.put(0x9f2504e4, TlReaders::readStarGiftAttributeBackdrop);
        READERS.put(0xcef7e7a8, TlReaders::readStarGiftAttributeRarityLegendary);
        READERS.put(0x78fbf3a8, TlReaders::readStarGiftAttributeRarityEpic);
        READERS.put(0xf08d516b, TlReaders::readStarGiftAttributeRarityRare);
        READERS.put(0xdbce6389, TlReaders::readStarGiftAttributeRarityUncommon);
        READERS.put(0x36437737, TlReaders::readStarGiftAttributeRarity);
        READERS.put(0x4e7085ea, TlReaders::readStarGiftAttributePattern);
        READERS.put(0x565251e2, TlReaders::readStarGiftAttributeModel);
        READERS.put(0x313a9547, TlReaders::readStarGift);
        READERS.put(0xaff56398, TlReaders::readStarGiftBackground);
        READERS.put(0x31cad303, TlReaders::readWebPageAttributeStarGiftCollection);
        READERS.put(0xcf6f6db8, TlReaders::readWebPageAttributeUniqueStarGift);
        READERS.put(0x50cc03d3, TlReaders::readWebPageAttributeStickerSet);
        READERS.put(0x2e94c3e7, TlReaders::readWebPageAttributeStory);
        READERS.put(0xffadc913, TlReaders::readStoryItemSkipped);
        READERS.put(0x51e6ee4f, TlReaders::readStoryItemDeleted);
        READERS.put(0x54b56617, TlReaders::readWebPageAttributeTheme);
        READERS.put(0xfa58b6d4, TlReaders::readThemeSettings);
        READERS.put(0x5b11125a, TlReaders::readBaseThemeArctic);
        READERS.put(0x6d5f77ee, TlReaders::readBaseThemeTinted);
        READERS.put(0xb7b31ea8, TlReaders::readBaseThemeNight);
        READERS.put(0xfbd81688, TlReaders::readBaseThemeDay);
        READERS.put(0xc3a12462, TlReaders::readBaseThemeClassic);
        READERS.put(0x98657f0d, TlReaders::readPage);
        READERS.put(0xb0d13e47, TlReaders::readWebPagePending);
        READERS.put(0x211a1788, TlReaders::readWebPageEmpty);
        READERS.put(0x52d8ccd9, TlReaders::readMessageMediaDocument);
        READERS.put(0x9f84f49e, TlReaders::readMessageMediaUnsupported);
        READERS.put(0x70322949, TlReaders::readMessageMediaContact);
        READERS.put(0x56e0d474, TlReaders::readMessageMediaGeo);
        READERS.put(0xe216eb63, TlReaders::readMessageMediaPhoto);
        READERS.put(0x3ded6320, TlReaders::readMessageMediaEmpty);
        READERS.put(0xba7bb15e, TlReaders::readPollResults);
        READERS.put(0x3645230a, TlReaders::readPollAnswerVoters);
        READERS.put(0xb826e150, TlReaders::readStoryFwdHeader);
        READERS.put(0x69d66c45, TlReaders::readInputReplyToMonoForum);
        READERS.put(0x5881323a, TlReaders::readInputReplyToStory);
        READERS.put(0x3bd4b7c2, TlReaders::readInputReplyToMessage);
        READERS.put(0x1b0c841a, TlReaders::readDraftMessageEmpty);
        READERS.put(0x99622c0c, TlReaders::readPeerNotifySettings);
        READERS.put(0xff6c8049, TlReaders::readNotificationSoundRingtone);
        READERS.put(0x830b9ae4, TlReaders::readNotificationSoundLocal);
        READERS.put(0x6f0c34df, TlReaders::readNotificationSoundNone);
        READERS.put(0x97e8bebe, TlReaders::readNotificationSoundDefault);
        READERS.put(0x23f109b, TlReaders::readForumTopicDeleted);
        READERS.put(0xae168909, TlReaders::readChannelAdminLogEventActionDeleteTopic);
        READERS.put(0xf06fe208, TlReaders::readChannelAdminLogEventActionEditTopic);
        READERS.put(0x58707d28, TlReaders::readChannelAdminLogEventActionCreateTopic);
        READERS.put(0x2cc6383, TlReaders::readChannelAdminLogEventActionToggleForum);
        READERS.put(0xf04fb3a9, TlReaders::readChannelAdminLogEventActionChangeUsernames);
        READERS.put(0xbe4e0ef8, TlReaders::readChannelAdminLogEventActionChangeAvailableReactions);
        READERS.put(0x661d4037, TlReaders::readChatReactionsSome);
        READERS.put(0x52928bca, TlReaders::readChatReactionsAll);
        READERS.put(0xeafc32bc, TlReaders::readChatReactionsNone);
        READERS.put(0x278f2868, TlReaders::readChannelAdminLogEventActionSendMessage);
        READERS.put(0x7a800e0a, TlReaders::readMessageService);
        READERS.put(0xa339f0b, TlReaders::readMessageReactions);
        READERS.put(0x4ba3a95a, TlReaders::readMessageReactor);
        READERS.put(0x8c79b63c, TlReaders::readMessagePeerReaction);
        READERS.put(0x16605e3e, TlReaders::readMessageActionManagedBotCreated);
        READERS.put(0x399674dc, TlReaders::readMessageActionPollDeleteAnswer);
        READERS.put(0x9da1cd6c, TlReaders::readMessageActionPollAppendAnswer);
        READERS.put(0x3e2793ba, TlReaders::readMessageActionNoForwardsRequest);
        READERS.put(0xbf7d6572, TlReaders::readMessageActionNoForwardsToggle);
        READERS.put(0xe188503b, TlReaders::readMessageActionChangeCreator);
        READERS.put(0xb07ed085, TlReaders::readMessageActionNewCreatorPending);
        READERS.put(0x73ada76b, TlReaders::readMessageActionStarGiftPurchaseOfferDeclined);
        READERS.put(0x774278d4, TlReaders::readMessageActionStarGiftPurchaseOffer);
        READERS.put(0x2c8f2a25, TlReaders::readMessageActionSuggestBirthday);
        READERS.put(0x6c8e1e06, TlReaders::readBirthday);
        READERS.put(0xa8a3c699, TlReaders::readMessageActionGiftTon);
        READERS.put(0x69f916f8, TlReaders::readMessageActionSuggestedPostRefund);
        READERS.put(0x95ddcf69, TlReaders::readMessageActionSuggestedPostSuccess);
        READERS.put(0xee7a1596, TlReaders::readMessageActionSuggestedPostApproval);
        READERS.put(0xc7edbc83, TlReaders::readMessageActionTodoAppendTasks);
        READERS.put(0xcc7c5c89, TlReaders::readMessageActionTodoCompletions);
        READERS.put(0x2ffe2f7a, TlReaders::readMessageActionConferenceCall);
        READERS.put(0x84b88578, TlReaders::readMessageActionPaidMessagesPrice);
        READERS.put(0xac1f1fcd, TlReaders::readMessageActionPaidMessagesRefunded);
        READERS.put(0xe6c31522, TlReaders::readMessageActionStarGiftUnique);
        READERS.put(0xea2c31d3, TlReaders::readMessageActionStarGift);
        READERS.put(0xb00c47a2, TlReaders::readMessageActionPrizeStars);
        READERS.put(0x45d5b021, TlReaders::readMessageActionGiftStars);
        READERS.put(0x41b3e202, TlReaders::readMessageActionPaymentRefunded);
        READERS.put(0xea02c27e, TlReaders::readPaymentCharge);
        READERS.put(0x93b31848, TlReaders::readMessageActionRequestedPeerSentMe);
        READERS.put(0x8ba403e4, TlReaders::readRequestedPeerChannel);
        READERS.put(0x7307544f, TlReaders::readRequestedPeerChat);
        READERS.put(0xd62ff46a, TlReaders::readRequestedPeerUser);
        READERS.put(0xcc02aa6d, TlReaders::readMessageActionBoostApply);
        READERS.put(0x87e2f155, TlReaders::readMessageActionGiveawayResults);
        READERS.put(0xa80f51e4, TlReaders::readMessageActionGiveawayLaunch);
        READERS.put(0x31c48347, TlReaders::readMessageActionGiftCode);
        READERS.put(0x5060a3f4, TlReaders::readMessageActionSetChatWallPaper);
        READERS.put(0x31518e9b, TlReaders::readMessageActionRequestedPeer);
        READERS.put(0x57de635e, TlReaders::readMessageActionSuggestProfilePhoto);
        READERS.put(0xc0944820, TlReaders::readMessageActionTopicEdit);
        READERS.put(0xd999256, TlReaders::readMessageActionTopicCreate);
        READERS.put(0x48e91302, TlReaders::readMessageActionGiftPremium);
        READERS.put(0xb4c38cb5, TlReaders::readMessageActionWebViewDataSent);
        READERS.put(0x47dd8079, TlReaders::readMessageActionWebViewDataSentMe);
        READERS.put(0xebbca3cb, TlReaders::readMessageActionChatJoinedByRequest);
        READERS.put(0xb91bbd3a, TlReaders::readMessageActionSetChatTheme);
        READERS.put(0x3458f9c8, TlReaders::readChatThemeUniqueGift);
        READERS.put(0xc3dffc04, TlReaders::readChatTheme);
        READERS.put(0xb3a07661, TlReaders::readMessageActionGroupCallScheduled);
        READERS.put(0x3c134d7b, TlReaders::readMessageActionSetMessagesTTL);
        READERS.put(0x502f92f7, TlReaders::readMessageActionInviteToGroupCall);
        READERS.put(0x7a0d7f42, TlReaders::readMessageActionGroupCall);
        READERS.put(0x98e0d697, TlReaders::readMessageActionGeoProximityReached);
        READERS.put(0xf3f25f76, TlReaders::readMessageActionContactSignUp);
        READERS.put(0xd95c6154, TlReaders::readMessageActionSecureValuesSent);
        READERS.put(0x8e3ca7ee, TlReaders::readSecureValueTypeEmail);
        READERS.put(0xb320aadb, TlReaders::readSecureValueTypePhone);
        READERS.put(0xea02ec33, TlReaders::readSecureValueTypeTemporaryRegistration);
        READERS.put(0x99e3806a, TlReaders::readSecureValueTypePassportRegistration);
        READERS.put(0x8b883488, TlReaders::readSecureValueTypeRentalAgreement);
        READERS.put(0x89137c0d, TlReaders::readSecureValueTypeBankStatement);
        READERS.put(0xfc36954e, TlReaders::readSecureValueTypeUtilityBill);
        READERS.put(0xcbe31e26, TlReaders::readSecureValueTypeAddress);
        READERS.put(0x99a48f23, TlReaders::readSecureValueTypeInternalPassport);
        READERS.put(0xa0d0744b, TlReaders::readSecureValueTypeIdentityCard);
        READERS.put(0x6e425c4, TlReaders::readSecureValueTypeDriverLicense);
        READERS.put(0x3dac6a00, TlReaders::readSecureValueTypePassport);
        READERS.put(0x9d2a81e3, TlReaders::readSecureValueTypePersonalDetails);
        READERS.put(0x1b287353, TlReaders::readMessageActionSecureValuesSentMe);
        READERS.put(0x33f0ea47, TlReaders::readSecureCredentialsEncrypted);
        READERS.put(0x187fa0ca, TlReaders::readSecureValue);
        READERS.put(0x21ec5a5f, TlReaders::readSecurePlainEmail);
        READERS.put(0x7d6099dd, TlReaders::readSecurePlainPhone);
        READERS.put(0x7d09c27e, TlReaders::readSecureFile);
        READERS.put(0x64199744, TlReaders::readSecureFileEmpty);
        READERS.put(0x8aeabec3, TlReaders::readSecureData);
        READERS.put(0xc516d679, TlReaders::readMessageActionBotAllowed);
        READERS.put(0x95fcd1d6, TlReaders::readBotApp);
        READERS.put(0x5da674b7, TlReaders::readBotAppNotModified);
        READERS.put(0xfae69f56, TlReaders::readMessageActionCustomAction);
        READERS.put(0x4792929b, TlReaders::readMessageActionScreenshotTaken);
        READERS.put(0x80e11a7f, TlReaders::readMessageActionPhoneCall);
        READERS.put(0x9fbbf1f7, TlReaders::readPhoneCallDiscardReasonMigrateConferenceCall);
        READERS.put(0xfaf7e8c9, TlReaders::readPhoneCallDiscardReasonBusy);
        READERS.put(0x57adc690, TlReaders::readPhoneCallDiscardReasonHangup);
        READERS.put(0xe095c1a0, TlReaders::readPhoneCallDiscardReasonDisconnect);
        READERS.put(0x85e42301, TlReaders::readPhoneCallDiscardReasonMissed);
        READERS.put(0xc624b16e, TlReaders::readMessageActionPaymentSent);
        READERS.put(0xffa00ccc, TlReaders::readMessageActionPaymentSentMe);
        READERS.put(0x909c3f94, TlReaders::readPaymentRequestedInfo);
        READERS.put(0x1e8caaeb, TlReaders::readPostAddress);
        READERS.put(0x92a72876, TlReaders::readMessageActionGameScore);
        READERS.put(0x9fbab604, TlReaders::readMessageActionHistoryClear);
        READERS.put(0x94bd38ed, TlReaders::readMessageActionPinMessage);
        READERS.put(0xea3948e9, TlReaders::readMessageActionChannelMigrateFrom);
        READERS.put(0xe1037f92, TlReaders::readMessageActionChatMigrateTo);
        READERS.put(0x95d2ac92, TlReaders::readMessageActionChannelCreate);
        READERS.put(0x31224c3, TlReaders::readMessageActionChatJoinedByLink);
        READERS.put(0xa43f30cc, TlReaders::readMessageActionChatDeleteUser);
        READERS.put(0x15cefd00, TlReaders::readMessageActionChatAddUser);
        READERS.put(0x95e3fbef, TlReaders::readMessageActionChatDeletePhoto);
        READERS.put(0x7fcb13a8, TlReaders::readMessageActionChatEditPhoto);
        READERS.put(0xb5a1ce5a, TlReaders::readMessageActionChatEditTitle);
        READERS.put(0xbd47cbad, TlReaders::readMessageActionChatCreate);
        READERS.put(0xb6aef7b0, TlReaders::readMessageActionEmpty);
        READERS.put(0xe5af939, TlReaders::readMessageReplyStoryHeader);
        READERS.put(0x1b97dd66, TlReaders::readMessageReplyHeader);
        READERS.put(0x4e4df4bb, TlReaders::readMessageFwdHeader);
        READERS.put(0x7600b9d3, TlReaders::readMessage);
        READERS.put(0xb89bfccf, TlReaders::readFactCheck);
        READERS.put(0x83d60fc2, TlReaders::readMessageReplies);
        READERS.put(0x48a30254, TlReaders::readReplyInlineMarkup);
        READERS.put(0x77608b83, TlReaders::readKeyboardButtonRow);
        READERS.put(0xbcc4af10, TlReaders::readKeyboardButtonCopy);
        READERS.put(0x4fdd3430, TlReaders::readKeyboardButtonStyle);
        READERS.put(0x2b78156, TlReaders::readInputKeyboardButtonRequestPeer);
        READERS.put(0x3e81e078, TlReaders::readRequestPeerTypeCreateBot);
        READERS.put(0x339bef6c, TlReaders::readRequestPeerTypeBroadcast);
        READERS.put(0xc9f06e1b, TlReaders::readRequestPeerTypeChat);
        READERS.put(0x5f3b8a00, TlReaders::readRequestPeerTypeUser);
        READERS.put(0x5b0f15f5, TlReaders::readKeyboardButtonRequestPeer);
        READERS.put(0xe15c4370, TlReaders::readKeyboardButtonSimpleWebView);
        READERS.put(0xe846b1a0, TlReaders::readKeyboardButtonWebView);
        READERS.put(0xc0fd5d09, TlReaders::readKeyboardButtonUserProfile);
        READERS.put(0x7d5e07c7, TlReaders::readInputKeyboardButtonUserProfile);
        READERS.put(0x7a11d782, TlReaders::readKeyboardButtonRequestPoll);
        READERS.put(0x68013e72, TlReaders::readInputKeyboardButtonUrlAuth);
        READERS.put(0xf51006f9, TlReaders::readKeyboardButtonUrlAuth);
        READERS.put(0x3fa53905, TlReaders::readKeyboardButtonBuy);
        READERS.put(0x89c590f9, TlReaders::readKeyboardButtonGame);
        READERS.put(0x991399fc, TlReaders::readKeyboardButtonSwitchInline);
        READERS.put(0xe3b2d0c, TlReaders::readInlineQueryPeerTypeBotPM);
        READERS.put(0x6334ee9a, TlReaders::readInlineQueryPeerTypeBroadcast);
        READERS.put(0x5ec4be43, TlReaders::readInlineQueryPeerTypeMegagroup);
        READERS.put(0xd766c50a, TlReaders::readInlineQueryPeerTypeChat);
        READERS.put(0x833c0fac, TlReaders::readInlineQueryPeerTypePM);
        READERS.put(0x3081ed9d, TlReaders::readInlineQueryPeerTypeSameBotPM);
        READERS.put(0xaa40f94d, TlReaders::readKeyboardButtonRequestGeoLocation);
        READERS.put(0x417efd8f, TlReaders::readKeyboardButtonRequestPhone);
        READERS.put(0xe62bc960, TlReaders::readKeyboardButtonCallback);
        READERS.put(0xd80c25ec, TlReaders::readKeyboardButtonUrl);
        READERS.put(0x7d170cff, TlReaders::readKeyboardButton);
        READERS.put(0x85dd99d1, TlReaders::readReplyKeyboardMarkup);
        READERS.put(0x86b40b08, TlReaders::readReplyKeyboardForceReply);
        READERS.put(0xa03e5b85, TlReaders::readReplyKeyboardHide);
        READERS.put(0x90a6ca84, TlReaders::readMessageEmpty);
        READERS.put(0xcb2ac766, TlReaders::readChannelAdminLogEventActionToggleNoForwards);
        READERS.put(0xafb6144a, TlReaders::readChannelAdminLogEventActionParticipantJoinByRequest);
        READERS.put(0xed107ab7, TlReaders::readChatInvitePublicJoinRequests);
        READERS.put(0xa22cbd96, TlReaders::readChatInviteExported);
        READERS.put(0x5416d58, TlReaders::readStarsSubscriptionPricing);
        READERS.put(0x6e941a38, TlReaders::readChannelAdminLogEventActionChangeHistoryTTL);
        READERS.put(0x3e7f6847, TlReaders::readChannelAdminLogEventActionParticipantVolume);
        READERS.put(0x2a3dc7ac, TlReaders::readGroupCallParticipant);
        READERS.put(0x67753ac8, TlReaders::readGroupCallParticipantVideo);
        READERS.put(0xdcb118b7, TlReaders::readGroupCallParticipantVideoSourceGroup);
        READERS.put(0xe90ebb59, TlReaders::readChannelAdminLogEventActionExportedInviteEdit);
        READERS.put(0x410a134e, TlReaders::readChannelAdminLogEventActionExportedInviteRevoke);
        READERS.put(0x5a50fca4, TlReaders::readChannelAdminLogEventActionExportedInviteDelete);
        READERS.put(0xfe9fc158, TlReaders::readChannelAdminLogEventActionParticipantJoinByInvite);
        READERS.put(0x56d6a247, TlReaders::readChannelAdminLogEventActionToggleGroupCallSetting);
        READERS.put(0xe64429c0, TlReaders::readChannelAdminLogEventActionParticipantUnmute);
        READERS.put(0xf92424d2, TlReaders::readChannelAdminLogEventActionParticipantMute);
        READERS.put(0xdb9f9140, TlReaders::readChannelAdminLogEventActionDiscardGroupCall);
        READERS.put(0x23209745, TlReaders::readChannelAdminLogEventActionStartGroupCall);
        READERS.put(0x53909779, TlReaders::readChannelAdminLogEventActionToggleSlowMode);
        READERS.put(0xe6b76ae, TlReaders::readChannelAdminLogEventActionChangeLocation);
        READERS.put(0x209b82db, TlReaders::readChannelLocation);
        READERS.put(0xbfb5ad8b, TlReaders::readChannelLocationEmpty);
        READERS.put(0x50c7ac8, TlReaders::readChannelAdminLogEventActionChangeLinkedChat);
        READERS.put(0x8f079643, TlReaders::readChannelAdminLogEventActionStopPoll);
        READERS.put(0x2df5fc0a, TlReaders::readChannelAdminLogEventActionDefaultBannedRights);
        READERS.put(0x5f5c95f1, TlReaders::readChannelAdminLogEventActionTogglePreHistoryHidden);
        READERS.put(0xb1c3caa7, TlReaders::readChannelAdminLogEventActionChangeStickerSet);
        READERS.put(0xd5676710, TlReaders::readChannelAdminLogEventActionParticipantToggleAdmin);
        READERS.put(0xe6d83d7e, TlReaders::readChannelAdminLogEventActionParticipantToggleBan);
        READERS.put(0xe31c34d8, TlReaders::readChannelAdminLogEventActionParticipantInvite);
        READERS.put(0xf89777f2, TlReaders::readChannelAdminLogEventActionParticipantLeave);
        READERS.put(0x183040d3, TlReaders::readChannelAdminLogEventActionParticipantJoin);
        READERS.put(0x42e047bb, TlReaders::readChannelAdminLogEventActionDeleteMessage);
        READERS.put(0x709b2405, TlReaders::readChannelAdminLogEventActionEditMessage);
        READERS.put(0xe9e82c18, TlReaders::readChannelAdminLogEventActionUpdatePinned);
        READERS.put(0x26ae0971, TlReaders::readChannelAdminLogEventActionToggleSignatures);
        READERS.put(0x1b7907ae, TlReaders::readChannelAdminLogEventActionToggleInvites);
        READERS.put(0x434bd2af, TlReaders::readChannelAdminLogEventActionChangePhoto);
        READERS.put(0x6a4afc38, TlReaders::readChannelAdminLogEventActionChangeUsername);
        READERS.put(0x55188a2e, TlReaders::readChannelAdminLogEventActionChangeAbout);
        READERS.put(0xe6dfb825, TlReaders::readChannelAdminLogEventActionChangeTitle);
        READERS.put(0x6cbe645, TlReaders::readUserFull);
        READERS.put(0xa2c0f695, TlReaders::readProfileTabGifs);
        READERS.put(0xd3656499, TlReaders::readProfileTabLinks);
        READERS.put(0xe477092e, TlReaders::readProfileTabVoice);
        READERS.put(0x9f27d26e, TlReaders::readProfileTabMusic);
        READERS.put(0xab339c00, TlReaders::readProfileTabFiles);
        READERS.put(0x72c64955, TlReaders::readProfileTabMedia);
        READERS.put(0x4d4bd46a, TlReaders::readProfileTabGifts);
        READERS.put(0xb98cd696, TlReaders::readProfileTabPosts);
        READERS.put(0x1b0e4f07, TlReaders::readStarsRating);
        READERS.put(0x71f276c4, TlReaders::readDisallowedGiftsSettings);
        READERS.put(0xf93cd45c, TlReaders::readBotVerification);
        READERS.put(0xdd0c66f2, TlReaders::readStarRefProgram);
        READERS.put(0x5a0a066d, TlReaders::readBusinessIntro);
        READERS.put(0xef156a5c, TlReaders::readBusinessAwayMessage);
        READERS.put(0x21108ff7, TlReaders::readBusinessRecipients);
        READERS.put(0xcc4d9ecc, TlReaders::readBusinessAwayMessageScheduleCustom);
        READERS.put(0xc3f2f501, TlReaders::readBusinessAwayMessageScheduleOutsideWorkHours);
        READERS.put(0xc9b9e2b9, TlReaders::readBusinessAwayMessageScheduleAlways);
        READERS.put(0xe519abab, TlReaders::readBusinessGreetingMessage);
        READERS.put(0xac5c1af7, TlReaders::readBusinessLocation);
        READERS.put(0x8c92b098, TlReaders::readBusinessWorkHours);
        READERS.put(0x120b1ab9, TlReaders::readBusinessWeeklyOpen);
        READERS.put(0x9a35e999, TlReaders::readPeerStories);
        READERS.put(0x4d8a0299, TlReaders::readBotInfo);
        READERS.put(0xb0cd6617, TlReaders::readBotVerifierSettings);
        READERS.put(0xc99b1950, TlReaders::readBotAppSettings);
        READERS.put(0xc7b57ce6, TlReaders::readBotMenuButton);
        READERS.put(0x4258c205, TlReaders::readBotMenuButtonCommands);
        READERS.put(0x7533a588, TlReaders::readBotMenuButtonDefault);
        READERS.put(0xc27ac8c7, TlReaders::readBotCommand);
        READERS.put(0xf47741f7, TlReaders::readPeerSettings);
        READERS.put(0x31774388, TlReaders::readUser);
        READERS.put(0x65899777, TlReaders::readUserStatusLastMonth);
        READERS.put(0x541a1d1a, TlReaders::readUserStatusLastWeek);
        READERS.put(0x7b197dc8, TlReaders::readUserStatusRecently);
        READERS.put(0x8c703f, TlReaders::readUserStatusOffline);
        READERS.put(0xedb93949, TlReaders::readUserStatusOnline);
        READERS.put(0x9d05049, TlReaders::readUserStatusEmpty);
        READERS.put(0x82d1f706, TlReaders::readUserProfilePhoto);
        READERS.put(0x4f11bae1, TlReaders::readUserProfilePhotoEmpty);
        READERS.put(0xd3bc4b7a, TlReaders::readUserEmpty);
        READERS.put(0x2633421b, TlReaders::readChatFull);
        READERS.put(0x3cbc93f8, TlReaders::readChatParticipants);
        READERS.put(0x360d5d2, TlReaders::readChatParticipantAdmin);
        READERS.put(0xe1f867b8, TlReaders::readChatParticipantCreator);
        READERS.put(0x38e79fde, TlReaders::readChatParticipant);
        READERS.put(0x8763d3e1, TlReaders::readChatParticipantsForbidden);
        READERS.put(0xa04e8d3a, TlReaders::readChannelFull);
        READERS.put(0x2dd14edc, TlReaders::readStickerSet);
        READERS.put(0xc776ba4e, TlReaders::readMessages_channelMessages);
        READERS.put(0x5f206716, TlReaders::readMessages_messagesSlice);
        READERS.put(0x3e0b5b6a, TlReaders::readSearchPostsFlood);
        READERS.put(0x1d73e7ea, TlReaders::readMessages_messages);
        READERS.put(0xa02bc13e, TlReaders::readUserFull_layer223);
        READERS.put(0xedf164f1, TlReaders::readStoryItem_layer223);
        READERS.put(0x4bd6e798, TlReaders::readMessageMediaPoll_layer223);
        READERS.put(0x7adf2420, TlReaders::readPollResults_layer223);
        READERS.put(0x3b6ddad2, TlReaders::readPollAnswerVoters_layer223);
        READERS.put(0x58747131, TlReaders::readPoll_layer223);
        READERS.put(0xff16e2ca, TlReaders::readPollAnswer_layer223);
        READERS.put(0x695150d7, TlReaders::readMessageMediaPhoto_layer223);
        READERS.put(0x6917560b, TlReaders::readMessageReplyHeader_layer223);
        READERS.put(0xb8425be9, TlReaders::readPoll_layer224);
        READERS.put(0x3ae56482, TlReaders::readMessage_layer224);
        READERS.put(0x9a8ae1e1, TlReaders::readPageBlockOrderedList_layer225);
        READERS.put(0x98dd8936, TlReaders::readPageListOrderedItemBlocks_layer225);
        READERS.put(0x25e073fc, TlReaders::readPageListItemBlocks_layer225);
        READERS.put(0xb92fb6cd, TlReaders::readPageListItemText_layer225);
        READERS.put(0x5e068047, TlReaders::readPageListOrderedItemText_layer225);
        READERS.put(0xe4e0b29d, TlReaders::readChannelFull_layer225);
        READERS.put(0x95ef6f2b, TlReaders::readMessage_layer225);
    }


    private static JsonObject readChannelAdminLogEvent(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEvent");
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "user_id", r.readLong());
        JsonUtils.add(obj, "action", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantEditRank(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantEditRank");
        JsonUtils.add(obj, "user_id", r.readLong());
        JsonUtils.add(obj, "prev_rank", r.readString());
        JsonUtils.add(obj, "new_rank", r.readString());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionToggleAutotranslation(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionToggleAutotranslation");
        JsonUtils.add(obj, "new_value", r.readBoolean());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantSubExtend(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantSubExtend");
        JsonUtils.add(obj, "prev_participant", r.readObject());
        JsonUtils.add(obj, "new_participant", r.readObject());
        return obj;
    }

    private static JsonObject readChannelParticipantLeft(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelParticipantLeft");
        JsonUtils.add(obj, "peer", r.readObject());
        return obj;
    }

    private static JsonObject readPeerChannel(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "peerChannel");
        JsonUtils.add(obj, "channel_id", r.readLong());
        return obj;
    }

    private static JsonObject readPeerChat(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "peerChat");
        JsonUtils.add(obj, "chat_id", r.readLong());
        return obj;
    }

    private static JsonObject readPeerUser(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "peerUser");
        JsonUtils.add(obj, "user_id", r.readLong());
        return obj;
    }

    private static JsonObject readChannelParticipantBanned(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelParticipantBanned");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("left", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "kicked_by", r.readLong());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "banned_rights", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "rank", r.readString());
        }
        return obj;
    }

    private static JsonObject readChatBannedRights(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatBannedRights");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("view_messages", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("send_messages", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("send_media", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("send_stickers", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("send_gifs", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("send_games", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("send_inline", TLObject.hasFlag(flags, TLObject.FLAG_6));
        obj.addProperty("embed_links", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("send_polls", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("change_info", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("invite_users", TLObject.hasFlag(flags, TLObject.FLAG_15));
        obj.addProperty("pin_messages", TLObject.hasFlag(flags, TLObject.FLAG_17));
        obj.addProperty("manage_topics", TLObject.hasFlag(flags, TLObject.FLAG_18));
        obj.addProperty("send_photos", TLObject.hasFlag(flags, TLObject.FLAG_19));
        obj.addProperty("send_videos", TLObject.hasFlag(flags, TLObject.FLAG_20));
        obj.addProperty("send_roundvideos", TLObject.hasFlag(flags, TLObject.FLAG_21));
        obj.addProperty("send_audios", TLObject.hasFlag(flags, TLObject.FLAG_22));
        obj.addProperty("send_voices", TLObject.hasFlag(flags, TLObject.FLAG_23));
        obj.addProperty("send_docs", TLObject.hasFlag(flags, TLObject.FLAG_24));
        obj.addProperty("send_plain", TLObject.hasFlag(flags, TLObject.FLAG_25));
        obj.addProperty("edit_rank", TLObject.hasFlag(flags, TLObject.FLAG_26));
        obj.addProperty("send_reactions", TLObject.hasFlag(flags, TLObject.FLAG_27));
        JsonUtils.add(obj, "until_date", r.readInt());
        return obj;
    }

    private static JsonObject readChannelParticipantAdmin(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelParticipantAdmin");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("can_edit", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("self", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "user_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "inviter_id", r.readLong());
        }
        JsonUtils.add(obj, "promoted_by", r.readLong());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "admin_rights", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "rank", r.readString());
        }
        return obj;
    }

    private static JsonObject readChatAdminRights(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatAdminRights");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("change_info", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("post_messages", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("edit_messages", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("delete_messages", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("ban_users", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("invite_users", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("pin_messages", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("add_admins", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("anonymous", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("manage_call", TLObject.hasFlag(flags, TLObject.FLAG_11));
        obj.addProperty("other", TLObject.hasFlag(flags, TLObject.FLAG_12));
        obj.addProperty("manage_topics", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("post_stories", TLObject.hasFlag(flags, TLObject.FLAG_14));
        obj.addProperty("edit_stories", TLObject.hasFlag(flags, TLObject.FLAG_15));
        obj.addProperty("delete_stories", TLObject.hasFlag(flags, TLObject.FLAG_16));
        obj.addProperty("manage_direct_messages", TLObject.hasFlag(flags, TLObject.FLAG_17));
        obj.addProperty("manage_ranks", TLObject.hasFlag(flags, TLObject.FLAG_18));
        return obj;
    }

    private static JsonObject readChannelParticipantCreator(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelParticipantCreator");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "user_id", r.readLong());
        JsonUtils.add(obj, "admin_rights", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "rank", r.readString());
        }
        return obj;
    }

    private static JsonObject readChannelParticipantSelf(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelParticipantSelf");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("via_request", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "user_id", r.readLong());
        JsonUtils.add(obj, "inviter_id", r.readLong());
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "subscription_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "rank", r.readString());
        }
        return obj;
    }

    private static JsonObject readChannelParticipant(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelParticipant");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "user_id", r.readLong());
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "subscription_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "rank", r.readString());
        }
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionToggleSignatureProfiles(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionToggleSignatureProfiles");
        JsonUtils.add(obj, "new_value", r.readBoolean());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeEmojiStickerSet(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeEmojiStickerSet");
        JsonUtils.add(obj, "prev_stickerset", r.readObject());
        JsonUtils.add(obj, "new_stickerset", r.readObject());
        return obj;
    }

    private static JsonObject readInputStickerSetTonGifts(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetTonGifts");
        return obj;
    }

    private static JsonObject readInputStickerSetEmojiChannelDefaultStatuses(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetEmojiChannelDefaultStatuses");
        return obj;
    }

    private static JsonObject readInputStickerSetEmojiDefaultTopicIcons(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetEmojiDefaultTopicIcons");
        return obj;
    }

    private static JsonObject readInputStickerSetEmojiDefaultStatuses(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetEmojiDefaultStatuses");
        return obj;
    }

    private static JsonObject readInputStickerSetEmojiGenericAnimations(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetEmojiGenericAnimations");
        return obj;
    }

    private static JsonObject readInputStickerSetPremiumGifts(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetPremiumGifts");
        return obj;
    }

    private static JsonObject readInputStickerSetAnimatedEmojiAnimations(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetAnimatedEmojiAnimations");
        return obj;
    }

    private static JsonObject readInputStickerSetDice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetDice");
        JsonUtils.add(obj, "emoticon", r.readString());
        return obj;
    }

    private static JsonObject readInputStickerSetAnimatedEmoji(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetAnimatedEmoji");
        return obj;
    }

    private static JsonObject readInputStickerSetShortName(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetShortName");
        JsonUtils.add(obj, "short_name", r.readString());
        return obj;
    }

    private static JsonObject readInputStickerSetID(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetID");
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        return obj;
    }

    private static JsonObject readInputStickerSetEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputStickerSetEmpty");
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeEmojiStatus(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeEmojiStatus");
        JsonUtils.add(obj, "prev_value", r.readObject());
        JsonUtils.add(obj, "new_value", r.readObject());
        return obj;
    }

    private static JsonObject readInputEmojiStatusCollectible(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputEmojiStatusCollectible");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "collectible_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "until", r.readInt());
        }
        return obj;
    }

    private static JsonObject readEmojiStatusCollectible(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "emojiStatusCollectible");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "collectible_id", r.readLong());
        JsonUtils.add(obj, "document_id", r.readLong());
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "slug", r.readString());
        JsonUtils.add(obj, "pattern_document_id", r.readLong());
        JsonUtils.add(obj, "center_color", r.readInt());
        JsonUtils.add(obj, "edge_color", r.readInt());
        JsonUtils.add(obj, "pattern_color", r.readInt());
        JsonUtils.add(obj, "text_color", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "until", r.readInt());
        }
        return obj;
    }

    private static JsonObject readEmojiStatus(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "emojiStatus");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "document_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "until", r.readInt());
        }
        return obj;
    }

    private static JsonObject readEmojiStatusEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "emojiStatusEmpty");
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeWallpaper(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeWallpaper");
        JsonUtils.add(obj, "prev_value", r.readObject());
        JsonUtils.add(obj, "new_value", r.readObject());
        return obj;
    }

    private static JsonObject readWallPaperNoFile(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "wallPaperNoFile");
        JsonUtils.add(obj, "id", r.readLong());
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("default", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("dark", TLObject.hasFlag(flags, TLObject.FLAG_4));
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "settings", r.readObject());
        }
        return obj;
    }

    private static JsonObject readWallPaperSettings(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "wallPaperSettings");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("blur", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("motion", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "background_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "second_background_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "third_background_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "fourth_background_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "intensity", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "rotation", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "emoticon", r.readString());
        }
        return obj;
    }

    private static JsonObject readWallPaper(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "wallPaper");
        JsonUtils.add(obj, "id", r.readLong());
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("default", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("pattern", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("dark", TLObject.hasFlag(flags, TLObject.FLAG_4));
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "slug", r.readString());
        JsonUtils.add(obj, "document", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "settings", r.readObject());
        }
        return obj;
    }

    private static JsonObject readDocument(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "document");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "file_reference", r.readBytes());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "mime_type", r.readString());
        JsonUtils.add(obj, "size", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "thumbs", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "video_thumbs", r.readVector(TlBinaryReader::readObject));
        }
        JsonUtils.add(obj, "dc_id", r.readInt());
        JsonUtils.add(obj, "attributes", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readDocumentAttributeCustomEmoji(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "documentAttributeCustomEmoji");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("free", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("text_color", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "alt", r.readString());
        JsonUtils.add(obj, "stickerset", r.readObject());
        return obj;
    }

    private static JsonObject readDocumentAttributeHasStickers(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "documentAttributeHasStickers");
        return obj;
    }

    private static JsonObject readDocumentAttributeFilename(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "documentAttributeFilename");
        JsonUtils.add(obj, "file_name", r.readString());
        return obj;
    }

    private static JsonObject readDocumentAttributeAudio(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "documentAttributeAudio");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("voice", TLObject.hasFlag(flags, TLObject.FLAG_10));
        JsonUtils.add(obj, "duration", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "performer", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "waveform", r.readBytes());
        }
        return obj;
    }

    private static JsonObject readDocumentAttributeVideo(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "documentAttributeVideo");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("round_message", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("supports_streaming", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("nosound", TLObject.hasFlag(flags, TLObject.FLAG_3));
        JsonUtils.add(obj, "duration", r.readDouble());
        JsonUtils.add(obj, "w", r.readInt());
        JsonUtils.add(obj, "h", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "preload_prefix_size", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "video_start_ts", r.readDouble());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "video_codec", r.readString());
        }
        return obj;
    }

    private static JsonObject readDocumentAttributeSticker(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "documentAttributeSticker");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("mask", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "alt", r.readString());
        JsonUtils.add(obj, "stickerset", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "mask_coords", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMaskCoords(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "maskCoords");
        JsonUtils.add(obj, "n", r.readInt());
        JsonUtils.add(obj, "x", r.readDouble());
        JsonUtils.add(obj, "y", r.readDouble());
        JsonUtils.add(obj, "zoom", r.readDouble());
        return obj;
    }

    private static JsonObject readDocumentAttributeAnimated(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "documentAttributeAnimated");
        return obj;
    }

    private static JsonObject readDocumentAttributeImageSize(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "documentAttributeImageSize");
        JsonUtils.add(obj, "w", r.readInt());
        JsonUtils.add(obj, "h", r.readInt());
        return obj;
    }

    private static JsonObject readVideoSizeStickerMarkup(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "videoSizeStickerMarkup");
        JsonUtils.add(obj, "stickerset", r.readObject());
        JsonUtils.add(obj, "sticker_id", r.readLong());
        JsonUtils.add(obj, "background_colors", r.readVector(TlBinaryReader::readInt));
        return obj;
    }

    private static JsonObject readVideoSizeEmojiMarkup(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "videoSizeEmojiMarkup");
        JsonUtils.add(obj, "emoji_id", r.readLong());
        JsonUtils.add(obj, "background_colors", r.readVector(TlBinaryReader::readInt));
        return obj;
    }

    private static JsonObject readVideoSize(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "videoSize");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "type", r.readString());
        JsonUtils.add(obj, "w", r.readInt());
        JsonUtils.add(obj, "h", r.readInt());
        JsonUtils.add(obj, "size", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "video_start_ts", r.readDouble());
        }
        return obj;
    }

    private static JsonObject readPhotoPathSize(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "photoPathSize");
        JsonUtils.add(obj, "type", r.readString());
        JsonUtils.add(obj, "bytes", r.readBytes());
        return obj;
    }

    private static JsonObject readPhotoSizeProgressive(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "photoSizeProgressive");
        JsonUtils.add(obj, "type", r.readString());
        JsonUtils.add(obj, "w", r.readInt());
        JsonUtils.add(obj, "h", r.readInt());
        JsonUtils.add(obj, "sizes", r.readVector(TlBinaryReader::readInt));
        return obj;
    }

    private static JsonObject readPhotoStrippedSize(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "photoStrippedSize");
        JsonUtils.add(obj, "type", r.readString());
        JsonUtils.add(obj, "bytes", r.readBytes());
        return obj;
    }

    private static JsonObject readPhotoCachedSize(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "photoCachedSize");
        JsonUtils.add(obj, "type", r.readString());
        JsonUtils.add(obj, "w", r.readInt());
        JsonUtils.add(obj, "h", r.readInt());
        JsonUtils.add(obj, "bytes", r.readBytes());
        return obj;
    }

    private static JsonObject readPhotoSize(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "photoSize");
        JsonUtils.add(obj, "type", r.readString());
        JsonUtils.add(obj, "w", r.readInt());
        JsonUtils.add(obj, "h", r.readInt());
        JsonUtils.add(obj, "size", r.readInt());
        return obj;
    }

    private static JsonObject readPhotoSizeEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "photoSizeEmpty");
        JsonUtils.add(obj, "type", r.readString());
        return obj;
    }

    private static JsonObject readDocumentEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "documentEmpty");
        JsonUtils.add(obj, "id", r.readLong());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeProfilePeerColor(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeProfilePeerColor");
        JsonUtils.add(obj, "prev_value", r.readObject());
        JsonUtils.add(obj, "new_value", r.readObject());
        return obj;
    }

    private static JsonObject readInputPeerColorCollectible(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPeerColorCollectible");
        JsonUtils.add(obj, "collectible_id", r.readLong());
        return obj;
    }

    private static JsonObject readPeerColorCollectible(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "peerColorCollectible");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "collectible_id", r.readLong());
        JsonUtils.add(obj, "gift_emoji_id", r.readLong());
        JsonUtils.add(obj, "background_emoji_id", r.readLong());
        JsonUtils.add(obj, "accent_color", r.readInt());
        JsonUtils.add(obj, "colors", r.readVector(TlBinaryReader::readInt));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "dark_accent_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "dark_colors", r.readVector(TlBinaryReader::readInt));
        }
        return obj;
    }

    private static JsonObject readPeerColor(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "peerColor");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "background_emoji_id", r.readLong());
        }
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangePeerColor(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangePeerColor");
        JsonUtils.add(obj, "prev_value", r.readObject());
        JsonUtils.add(obj, "new_value", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionToggleAntiSpam(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionToggleAntiSpam");
        JsonUtils.add(obj, "new_value", r.readBoolean());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionPinTopic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionPinTopic");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "prev_topic", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "new_topic", r.readObject());
        }
        return obj;
    }

    private static JsonObject readForumTopic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "forumTopic");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("my", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("closed", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("pinned", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("short", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("hidden", TLObject.hasFlag(flags, TLObject.FLAG_6));
        obj.addProperty("title_missing", TLObject.hasFlag(flags, TLObject.FLAG_7));
        JsonUtils.add(obj, "id", r.readInt());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "icon_color", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "icon_emoji_id", r.readLong());
        }
        JsonUtils.add(obj, "top_message", r.readInt());
        JsonUtils.add(obj, "read_inbox_max_id", r.readInt());
        JsonUtils.add(obj, "read_outbox_max_id", r.readInt());
        JsonUtils.add(obj, "unread_count", r.readInt());
        JsonUtils.add(obj, "unread_mentions_count", r.readInt());
        JsonUtils.add(obj, "unread_reactions_count", r.readInt());
        JsonUtils.add(obj, "unread_poll_votes_count", r.readInt());
        JsonUtils.add(obj, "from_id", r.readObject());
        JsonUtils.add(obj, "notify_settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "draft", r.readObject());
        }
        return obj;
    }

    private static JsonObject readDraftMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "draftMessage");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("no_webpage", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("invert_media", TLObject.hasFlag(flags, TLObject.FLAG_6));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "reply_to", r.readObject());
        }
        JsonUtils.add(obj, "message", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "media", r.readObject());
        }
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "effect", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "suggested_post", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "rich_message", r.readObject());
        }
        return obj;
    }

    private static JsonObject readRichMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "richMessage");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("rtl", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("part", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "blocks", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "photos", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "documents", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readPhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "photo");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("has_stickers", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "file_reference", r.readBytes());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "sizes", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "video_sizes", r.readVector(TlBinaryReader::readObject));
        }
        JsonUtils.add(obj, "dc_id", r.readInt());
        return obj;
    }

    private static JsonObject readPhotoEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "photoEmpty");
        JsonUtils.add(obj, "id", r.readLong());
        return obj;
    }

    private static JsonObject readPageBlockBlockquoteBlocks(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockBlockquoteBlocks");
        JsonUtils.add(obj, "blocks", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readTextDate(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textDate");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("relative", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("short_time", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("long_time", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("short_date", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("long_date", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("day_of_week", TLObject.hasFlag(flags, TLObject.FLAG_5));
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "date", r.readInt());
        return obj;
    }

    private static JsonObject readTextMentionName(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textMentionName");
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "user_id", r.readLong());
        return obj;
    }

    private static JsonObject readTextBankCard(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textBankCard");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextAutoPhone(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textAutoPhone");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextAutoEmail(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textAutoEmail");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextAutoUrl(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textAutoUrl");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextCashtag(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textCashtag");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextBotCommand(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textBotCommand");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextHashtag(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textHashtag");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextMention(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textMention");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextSpoiler(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textSpoiler");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextCustomEmoji(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textCustomEmoji");
        JsonUtils.add(obj, "document_id", r.readLong());
        JsonUtils.add(obj, "alt", r.readString());
        return obj;
    }

    private static JsonObject readTextMath(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textMath");
        JsonUtils.add(obj, "source", r.readString());
        return obj;
    }

    private static JsonObject readTextAnchor(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textAnchor");
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "name", r.readString());
        return obj;
    }

    private static JsonObject readTextImage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textImage");
        JsonUtils.add(obj, "document_id", r.readLong());
        JsonUtils.add(obj, "w", r.readInt());
        JsonUtils.add(obj, "h", r.readInt());
        return obj;
    }

    private static JsonObject readTextPhone(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textPhone");
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "phone", r.readString());
        return obj;
    }

    private static JsonObject readTextMarked(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textMarked");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextSuperscript(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textSuperscript");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextSubscript(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textSubscript");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextConcat(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textConcat");
        JsonUtils.add(obj, "texts", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readTextEmail(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textEmail");
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "email", r.readString());
        return obj;
    }

    private static JsonObject readTextUrl(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textUrl");
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "url", r.readString());
        JsonUtils.add(obj, "webpage_id", r.readLong());
        return obj;
    }

    private static JsonObject readTextFixed(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textFixed");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextStrike(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textStrike");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextUnderline(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textUnderline");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextItalic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textItalic");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextBold(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textBold");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readTextPlain(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textPlain");
        JsonUtils.add(obj, "text", r.readString());
        return obj;
    }

    private static JsonObject readTextEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textEmpty");
        return obj;
    }

    private static JsonObject readInputPageBlockMap(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPageBlockMap");
        JsonUtils.add(obj, "geo", r.readObject());
        JsonUtils.add(obj, "zoom", r.readInt());
        JsonUtils.add(obj, "w", r.readInt());
        JsonUtils.add(obj, "h", r.readInt());
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readPageCaption(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageCaption");
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "credit", r.readObject());
        return obj;
    }

    private static JsonObject readInputGeoPoint(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputGeoPoint");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "lat", r.readDouble());
        JsonUtils.add(obj, "long", r.readDouble());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "accuracy_radius", r.readInt());
        }
        return obj;
    }

    private static JsonObject readInputGeoPointEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputGeoPointEmpty");
        return obj;
    }

    private static JsonObject readPageBlockThinking(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockThinking");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockMath(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockMath");
        JsonUtils.add(obj, "source", r.readString());
        return obj;
    }

    private static JsonObject readPageBlockHeading6(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockHeading6");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockHeading5(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockHeading5");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockHeading4(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockHeading4");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockHeading3(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockHeading3");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockHeading2(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockHeading2");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockHeading1(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockHeading1");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockMap(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockMap");
        JsonUtils.add(obj, "geo", r.readObject());
        JsonUtils.add(obj, "zoom", r.readInt());
        JsonUtils.add(obj, "w", r.readInt());
        JsonUtils.add(obj, "h", r.readInt());
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readGeoPoint(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "geoPoint");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "long", r.readDouble());
        JsonUtils.add(obj, "lat", r.readDouble());
        JsonUtils.add(obj, "access_hash", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "accuracy_radius", r.readInt());
        }
        return obj;
    }

    private static JsonObject readGeoPointEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "geoPointEmpty");
        return obj;
    }

    private static JsonObject readPageBlockRelatedArticles(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockRelatedArticles");
        JsonUtils.add(obj, "title", r.readObject());
        JsonUtils.add(obj, "articles", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readPageRelatedArticle(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageRelatedArticle");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "url", r.readString());
        JsonUtils.add(obj, "webpage_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "description", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "photo_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "published_date", r.readInt());
        }
        return obj;
    }

    private static JsonObject readPageBlockDetails(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockDetails");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("open", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "blocks", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "title", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockOrderedList(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockOrderedList");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("reversed", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "items", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "start", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "type", r.readString());
        }
        return obj;
    }

    private static JsonObject readPageListOrderedItemBlocks(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageListOrderedItemBlocks");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("checkbox", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("checked", TLObject.hasFlag(flags, TLObject.FLAG_1));
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "num", r.readString());
        }
        JsonUtils.add(obj, "blocks", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "value", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "type", r.readString());
        }
        return obj;
    }

    private static JsonObject readPageBlockTable(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockTable");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("bordered", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("striped", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "title", r.readObject());
        JsonUtils.add(obj, "rows", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readPageTableRow(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageTableRow");
        JsonUtils.add(obj, "cells", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readPageTableCell(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageTableCell");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("header", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("align_center", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("align_right", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("valign_middle", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("valign_bottom", TLObject.hasFlag(flags, TLObject.FLAG_6));
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "text", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "colspan", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "rowspan", r.readInt());
        }
        return obj;
    }

    private static JsonObject readPageBlockKicker(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockKicker");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockAudio(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockAudio");
        JsonUtils.add(obj, "audio_id", r.readLong());
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockChannel(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockChannel");
        JsonUtils.add(obj, "channel", r.readObject());
        return obj;
    }

    private static JsonObject readChannelForbidden(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelForbidden");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("broadcast", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("megagroup", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("monoforum", TLObject.hasFlag(flags, TLObject.FLAG_10));
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "title", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            JsonUtils.add(obj, "until_date", r.readInt());
        }
        return obj;
    }

    private static JsonObject readChannel(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channel");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("left", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("broadcast", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("verified", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("megagroup", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("restricted", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("signatures", TLObject.hasFlag(flags, TLObject.FLAG_11));
        obj.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_12));
        obj.addProperty("scam", TLObject.hasFlag(flags, TLObject.FLAG_19));
        obj.addProperty("has_link", TLObject.hasFlag(flags, TLObject.FLAG_20));
        obj.addProperty("has_geo", TLObject.hasFlag(flags, TLObject.FLAG_21));
        obj.addProperty("slowmode_enabled", TLObject.hasFlag(flags, TLObject.FLAG_22));
        obj.addProperty("call_active", TLObject.hasFlag(flags, TLObject.FLAG_23));
        obj.addProperty("call_not_empty", TLObject.hasFlag(flags, TLObject.FLAG_24));
        obj.addProperty("fake", TLObject.hasFlag(flags, TLObject.FLAG_25));
        obj.addProperty("gigagroup", TLObject.hasFlag(flags, TLObject.FLAG_26));
        obj.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_27));
        obj.addProperty("join_to_send", TLObject.hasFlag(flags, TLObject.FLAG_28));
        obj.addProperty("join_request", TLObject.hasFlag(flags, TLObject.FLAG_29));
        obj.addProperty("forum", TLObject.hasFlag(flags, TLObject.FLAG_30));
        var flags2 = r.readInt();
        obj.addProperty("flags2", flags2);
        obj.addProperty("stories_hidden", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        obj.addProperty("stories_hidden_min", TLObject.hasFlag(flags2, TLObject.FLAG_2));
        obj.addProperty("stories_unavailable", TLObject.hasFlag(flags2, TLObject.FLAG_3));
        obj.addProperty("signature_profiles", TLObject.hasFlag(flags2, TLObject.FLAG_12));
        obj.addProperty("autotranslation", TLObject.hasFlag(flags2, TLObject.FLAG_15));
        obj.addProperty("broadcast_messages_allowed", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        obj.addProperty("monoforum", TLObject.hasFlag(flags2, TLObject.FLAG_17));
        obj.addProperty("forum_tabs", TLObject.hasFlag(flags2, TLObject.FLAG_19));
        JsonUtils.add(obj, "id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "access_hash", r.readLong());
        }
        JsonUtils.add(obj, "title", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "username", r.readString());
        }
        JsonUtils.add(obj, "photo", r.readObject());
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "banned_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "default_banned_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "participants_count", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "usernames", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "stories_max_id", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "profile_color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "emoji_status", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "level", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "subscription_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "bot_verification_icon", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "send_paid_messages_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "linked_monoforum_id", r.readLong());
        }
        return obj;
    }

    private static JsonObject readRecentStory(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "recentStory");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("live", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "max_id", r.readInt());
        }
        return obj;
    }

    private static JsonObject readUsername(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "username");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("editable", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("active", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "username", r.readString());
        return obj;
    }

    private static JsonObject readRestrictionReason(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "restrictionReason");
        JsonUtils.add(obj, "platform", r.readString());
        JsonUtils.add(obj, "reason", r.readString());
        JsonUtils.add(obj, "text", r.readString());
        return obj;
    }

    private static JsonObject readChatPhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatPhoto");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("has_video", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "photo_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "stripped_thumb", r.readBytes());
        }
        JsonUtils.add(obj, "dc_id", r.readInt());
        return obj;
    }

    private static JsonObject readChatPhotoEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatPhotoEmpty");
        return obj;
    }

    private static JsonObject readChatForbidden(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatForbidden");
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "title", r.readString());
        return obj;
    }

    private static JsonObject readChat(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chat");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("left", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("deactivated", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("call_active", TLObject.hasFlag(flags, TLObject.FLAG_23));
        obj.addProperty("call_not_empty", TLObject.hasFlag(flags, TLObject.FLAG_24));
        obj.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_25));
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "photo", r.readObject());
        JsonUtils.add(obj, "participants_count", r.readInt());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "version", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "migrated_to", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "default_banned_rights", r.readObject());
        }
        return obj;
    }

    private static JsonObject readInputChannelFromMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputChannelFromMessage");
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "msg_id", r.readInt());
        JsonUtils.add(obj, "channel_id", r.readLong());
        return obj;
    }

    private static JsonObject readInputPeerChannelFromMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPeerChannelFromMessage");
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "msg_id", r.readInt());
        JsonUtils.add(obj, "channel_id", r.readLong());
        return obj;
    }

    private static JsonObject readInputPeerUserFromMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPeerUserFromMessage");
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "msg_id", r.readInt());
        JsonUtils.add(obj, "user_id", r.readLong());
        return obj;
    }

    private static JsonObject readInputPeerChannel(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPeerChannel");
        JsonUtils.add(obj, "channel_id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        return obj;
    }

    private static JsonObject readInputPeerUser(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPeerUser");
        JsonUtils.add(obj, "user_id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        return obj;
    }

    private static JsonObject readInputPeerChat(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPeerChat");
        JsonUtils.add(obj, "chat_id", r.readLong());
        return obj;
    }

    private static JsonObject readInputPeerSelf(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPeerSelf");
        return obj;
    }

    private static JsonObject readInputPeerEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPeerEmpty");
        return obj;
    }

    private static JsonObject readInputChannel(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputChannel");
        JsonUtils.add(obj, "channel_id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        return obj;
    }

    private static JsonObject readInputChannelEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputChannelEmpty");
        return obj;
    }

    private static JsonObject readChatEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatEmpty");
        JsonUtils.add(obj, "id", r.readLong());
        return obj;
    }

    private static JsonObject readPageBlockSlideshow(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockSlideshow");
        JsonUtils.add(obj, "items", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockCollage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockCollage");
        JsonUtils.add(obj, "items", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockEmbedPost(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockEmbedPost");
        JsonUtils.add(obj, "url", r.readString());
        JsonUtils.add(obj, "webpage_id", r.readLong());
        JsonUtils.add(obj, "author_photo_id", r.readLong());
        JsonUtils.add(obj, "author", r.readString());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "blocks", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockEmbed(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockEmbed");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("full_width", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("allow_scrolling", TLObject.hasFlag(flags, TLObject.FLAG_3));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "html", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "poster_photo_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "w", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "h", r.readInt());
        }
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockCover(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockCover");
        JsonUtils.add(obj, "cover", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockVideo(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockVideo");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("autoplay", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("loop", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "video_id", r.readLong());
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockPhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockPhoto");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "photo_id", r.readLong());
        JsonUtils.add(obj, "caption", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "webpage_id", r.readLong());
        }
        return obj;
    }

    private static JsonObject readPageBlockPullquote(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockPullquote");
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockBlockquote(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockBlockquote");
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "caption", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockList(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockList");
        JsonUtils.add(obj, "items", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readPageListItemBlocks(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageListItemBlocks");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("checkbox", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("checked", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "blocks", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readPageBlockAnchor(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockAnchor");
        JsonUtils.add(obj, "name", r.readString());
        return obj;
    }

    private static JsonObject readPageBlockDivider(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockDivider");
        return obj;
    }

    private static JsonObject readPageBlockFooter(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockFooter");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockPreformatted(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockPreformatted");
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "language", r.readString());
        return obj;
    }

    private static JsonObject readPageBlockParagraph(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockParagraph");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockSubheader(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockSubheader");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockHeader(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockHeader");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockAuthorDate(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockAuthorDate");
        JsonUtils.add(obj, "author", r.readObject());
        JsonUtils.add(obj, "published_date", r.readInt());
        return obj;
    }

    private static JsonObject readPageBlockSubtitle(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockSubtitle");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockTitle(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockTitle");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageBlockUnsupported(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockUnsupported");
        return obj;
    }

    private static JsonObject readPageListItemText(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageListItemText");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("checkbox", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("checked", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageListOrderedItemText(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageListOrderedItemText");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("checkbox", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("checked", TLObject.hasFlag(flags, TLObject.FLAG_1));
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "num", r.readString());
        }
        JsonUtils.add(obj, "text", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "value", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "type", r.readString());
        }
        return obj;
    }

    private static JsonObject readSuggestedPost(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "suggestedPost");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("accepted", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("rejected", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "price", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "schedule_date", r.readInt());
        }
        return obj;
    }

    private static JsonObject readStarsTonAmount(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starsTonAmount");
        JsonUtils.add(obj, "amount", r.readLong());
        return obj;
    }

    private static JsonObject readStarsAmount(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starsAmount");
        JsonUtils.add(obj, "amount", r.readLong());
        JsonUtils.add(obj, "nanos", r.readInt());
        return obj;
    }

    private static JsonObject readInputMediaStakeDice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaStakeDice");
        JsonUtils.add(obj, "game_hash", r.readString());
        JsonUtils.add(obj, "ton_amount", r.readLong());
        JsonUtils.add(obj, "client_seed", r.readBytes());
        return obj;
    }

    private static JsonObject readInputMediaTodo(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaTodo");
        JsonUtils.add(obj, "todo", r.readObject());
        return obj;
    }

    private static JsonObject readTodoList(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "todoList");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("others_can_append", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("others_can_complete", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "title", r.readObject());
        JsonUtils.add(obj, "list", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readTodoItem(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "todoItem");
        JsonUtils.add(obj, "id", r.readInt());
        JsonUtils.add(obj, "title", r.readObject());
        return obj;
    }

    private static JsonObject readTextWithEntities(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "textWithEntities");
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "entities", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readMessageEntityDiffDelete(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityDiffDelete");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityDiffReplace(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityDiffReplace");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        JsonUtils.add(obj, "old_text", r.readString());
        return obj;
    }

    private static JsonObject readMessageEntityDiffInsert(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityDiffInsert");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityFormattedDate(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityFormattedDate");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("relative", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("short_time", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("long_time", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("short_date", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("long_date", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("day_of_week", TLObject.hasFlag(flags, TLObject.FLAG_5));
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        JsonUtils.add(obj, "date", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityBlockquote(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityBlockquote");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("collapsed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityCustomEmoji(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityCustomEmoji");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        JsonUtils.add(obj, "document_id", r.readLong());
        return obj;
    }

    private static JsonObject readMessageEntitySpoiler(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntitySpoiler");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityBankCard(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityBankCard");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityStrike(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityStrike");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityUnderline(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityUnderline");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityCashtag(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityCashtag");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityPhone(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityPhone");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readInputMessageEntityMentionName(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMessageEntityMentionName");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        JsonUtils.add(obj, "user_id", r.readObject());
        return obj;
    }

    private static JsonObject readInputUserFromMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputUserFromMessage");
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "msg_id", r.readInt());
        JsonUtils.add(obj, "user_id", r.readLong());
        return obj;
    }

    private static JsonObject readInputUser(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputUser");
        JsonUtils.add(obj, "user_id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        return obj;
    }

    private static JsonObject readInputUserSelf(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputUserSelf");
        return obj;
    }

    private static JsonObject readInputUserEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputUserEmpty");
        return obj;
    }

    private static JsonObject readMessageEntityMentionName(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityMentionName");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        JsonUtils.add(obj, "user_id", r.readLong());
        return obj;
    }

    private static JsonObject readMessageEntityTextUrl(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityTextUrl");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        JsonUtils.add(obj, "url", r.readString());
        return obj;
    }

    private static JsonObject readMessageEntityPre(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityPre");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        JsonUtils.add(obj, "language", r.readString());
        return obj;
    }

    private static JsonObject readMessageEntityCode(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityCode");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityItalic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityItalic");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityBold(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityBold");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityEmail(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityEmail");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityUrl(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityUrl");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityBotCommand(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityBotCommand");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityHashtag(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityHashtag");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityMention(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityMention");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readMessageEntityUnknown(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEntityUnknown");
        JsonUtils.add(obj, "offset", r.readInt());
        JsonUtils.add(obj, "length", r.readInt());
        return obj;
    }

    private static JsonObject readInputMediaPaidMedia(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaPaidMedia");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "stars_amount", r.readLong());
        JsonUtils.add(obj, "extended_media", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "payload", r.readString());
        }
        return obj;
    }

    private static JsonObject readInputMediaWebPage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaWebPage");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("force_large_media", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("force_small_media", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("optional", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "url", r.readString());
        return obj;
    }

    private static JsonObject readInputMediaStory(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaStory");
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "id", r.readInt());
        return obj;
    }

    private static JsonObject readInputMediaDice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaDice");
        JsonUtils.add(obj, "emoticon", r.readString());
        return obj;
    }

    private static JsonObject readInputMediaPoll(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaPoll");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "poll", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "correct_answers", r.readVector(TlBinaryReader::readInt));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "attached_media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "solution", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "solution_entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "solution_media", r.readObject());
        }
        return obj;
    }

    private static JsonObject readInputMediaGeoLive(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaGeoLive");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("stopped", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "geo_point", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "heading", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "proximity_notification_radius", r.readInt());
        }
        return obj;
    }

    private static JsonObject readInputMediaInvoice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaInvoice");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "description", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "photo", r.readObject());
        }
        JsonUtils.add(obj, "invoice", r.readObject());
        JsonUtils.add(obj, "payload", r.readBytes());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "provider", r.readString());
        }
        JsonUtils.add(obj, "provider_data", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "start_param", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "extended_media", r.readObject());
        }
        return obj;
    }

    private static JsonObject readInputMediaGame(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaGame");
        JsonUtils.add(obj, "id", r.readObject());
        return obj;
    }

    private static JsonObject readInputGameShortName(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputGameShortName");
        JsonUtils.add(obj, "bot_id", r.readObject());
        JsonUtils.add(obj, "short_name", r.readString());
        return obj;
    }

    private static JsonObject readInputGameID(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputGameID");
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        return obj;
    }

    private static JsonObject readInputMediaDocumentExternal(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaDocumentExternal");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "url", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "ttl_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "video_cover", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "video_timestamp", r.readInt());
        }
        return obj;
    }

    private static JsonObject readInputPhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPhoto");
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "file_reference", r.readBytes());
        return obj;
    }

    private static JsonObject readInputPhotoEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPhotoEmpty");
        return obj;
    }

    private static JsonObject readInputMediaPhotoExternal(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaPhotoExternal");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "url", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "ttl_seconds", r.readInt());
        }
        return obj;
    }

    private static JsonObject readInputMediaVenue(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaVenue");
        JsonUtils.add(obj, "geo_point", r.readObject());
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "address", r.readString());
        JsonUtils.add(obj, "provider", r.readString());
        JsonUtils.add(obj, "venue_id", r.readString());
        JsonUtils.add(obj, "venue_type", r.readString());
        return obj;
    }

    private static JsonObject readInputMediaDocument(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaDocument");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "video_cover", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "video_timestamp", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "ttl_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "query", r.readString());
        }
        return obj;
    }

    private static JsonObject readInputDocument(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputDocument");
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "file_reference", r.readBytes());
        return obj;
    }

    private static JsonObject readInputDocumentEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputDocumentEmpty");
        return obj;
    }

    private static JsonObject readInputMediaUploadedDocument(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaUploadedDocument");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("nosound_video", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("force_file", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_5));
        JsonUtils.add(obj, "file", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "thumb", r.readObject());
        }
        JsonUtils.add(obj, "mime_type", r.readString());
        JsonUtils.add(obj, "attributes", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "stickers", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "video_cover", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "video_timestamp", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "ttl_seconds", r.readInt());
        }
        return obj;
    }

    private static JsonObject readInputFileStoryDocument(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputFileStoryDocument");
        JsonUtils.add(obj, "id", r.readObject());
        return obj;
    }

    private static JsonObject readInputFileBig(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputFileBig");
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "parts", r.readInt());
        JsonUtils.add(obj, "name", r.readString());
        return obj;
    }

    private static JsonObject readInputFile(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputFile");
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "parts", r.readInt());
        JsonUtils.add(obj, "name", r.readString());
        JsonUtils.add(obj, "md5_checksum", r.readString());
        return obj;
    }

    private static JsonObject readInputMediaContact(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaContact");
        JsonUtils.add(obj, "phone_number", r.readString());
        JsonUtils.add(obj, "first_name", r.readString());
        JsonUtils.add(obj, "last_name", r.readString());
        JsonUtils.add(obj, "vcard", r.readString());
        return obj;
    }

    private static JsonObject readInputMediaGeoPoint(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaGeoPoint");
        JsonUtils.add(obj, "geo_point", r.readObject());
        return obj;
    }

    private static JsonObject readInputMediaPhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaPhoto");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("live_photo", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "ttl_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "video", r.readObject());
        }
        return obj;
    }

    private static JsonObject readInputMediaUploadedPhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaUploadedPhoto");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("live_photo", TLObject.hasFlag(flags, TLObject.FLAG_3));
        JsonUtils.add(obj, "file", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "stickers", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "ttl_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "video", r.readObject());
        }
        return obj;
    }

    private static JsonObject readInputMediaEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaEmpty");
        return obj;
    }

    private static JsonObject readDataJSON(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "dataJSON");
        JsonUtils.add(obj, "data", r.readString());
        return obj;
    }

    private static JsonObject readInvoice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "invoice");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("test", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("name_requested", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("phone_requested", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("email_requested", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("shipping_address_requested", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("flexible", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("phone_to_provider", TLObject.hasFlag(flags, TLObject.FLAG_6));
        obj.addProperty("email_to_provider", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("recurring", TLObject.hasFlag(flags, TLObject.FLAG_9));
        JsonUtils.add(obj, "currency", r.readString());
        JsonUtils.add(obj, "prices", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "max_tip_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "suggested_tip_amounts", r.readVector(TlBinaryReader::readLong));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "terms_url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "subscription_period", r.readInt());
        }
        return obj;
    }

    private static JsonObject readLabeledPrice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "labeledPrice");
        JsonUtils.add(obj, "label", r.readString());
        JsonUtils.add(obj, "amount", r.readLong());
        return obj;
    }

    private static JsonObject readInputWebDocument(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputWebDocument");
        JsonUtils.add(obj, "url", r.readString());
        JsonUtils.add(obj, "size", r.readInt());
        JsonUtils.add(obj, "mime_type", r.readString());
        JsonUtils.add(obj, "attributes", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readPoll(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "poll");
        JsonUtils.add(obj, "id", r.readLong());
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("closed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("public_voters", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("multiple_choice", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("quiz", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("open_answers", TLObject.hasFlag(flags, TLObject.FLAG_6));
        obj.addProperty("revoting_disabled", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("shuffle_answers", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("hide_results_until_close", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("subscribers_only", TLObject.hasFlag(flags, TLObject.FLAG_11));
        JsonUtils.add(obj, "question", r.readObject());
        JsonUtils.add(obj, "answers", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "close_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "close_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "countries_iso2", r.readVector(TlBinaryReader::readString));
        }
        JsonUtils.add(obj, "hash", r.readLong());
        return obj;
    }

    private static JsonObject readInputPollAnswer(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputPollAnswer");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "text", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "media", r.readObject());
        }
        return obj;
    }

    private static JsonObject readPollAnswer(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pollAnswer");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "option", r.readBytes());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "added_by", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "date", r.readInt());
        }
        return obj;
    }

    private static JsonObject readMessageMediaVideoStream(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaVideoStream");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("rtmp_stream", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "call", r.readObject());
        return obj;
    }

    private static JsonObject readInputGroupCallInviteMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputGroupCallInviteMessage");
        JsonUtils.add(obj, "msg_id", r.readInt());
        return obj;
    }

    private static JsonObject readInputGroupCallSlug(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputGroupCallSlug");
        JsonUtils.add(obj, "slug", r.readString());
        return obj;
    }

    private static JsonObject readInputGroupCall(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputGroupCall");
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        return obj;
    }

    private static JsonObject readMessageMediaToDo(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaToDo");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "todo", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "completions", r.readVector(TlBinaryReader::readObject));
        }
        return obj;
    }

    private static JsonObject readTodoCompletion(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "todoCompletion");
        JsonUtils.add(obj, "id", r.readInt());
        JsonUtils.add(obj, "completed_by", r.readObject());
        JsonUtils.add(obj, "date", r.readInt());
        return obj;
    }

    private static JsonObject readMessageMediaPaidMedia(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaPaidMedia");
        JsonUtils.add(obj, "stars_amount", r.readLong());
        JsonUtils.add(obj, "extended_media", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readMessageExtendedMedia(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageExtendedMedia");
        JsonUtils.add(obj, "media", r.readObject());
        return obj;
    }

    private static JsonObject readMessageMediaGiveawayResults(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaGiveawayResults");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("only_new_subscribers", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("refunded", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "channel_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "additional_peers_count", r.readInt());
        }
        JsonUtils.add(obj, "launch_msg_id", r.readInt());
        JsonUtils.add(obj, "winners_count", r.readInt());
        JsonUtils.add(obj, "unclaimed_count", r.readInt());
        JsonUtils.add(obj, "winners", r.readVector(TlBinaryReader::readLong));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "months", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "prize_description", r.readString());
        }
        JsonUtils.add(obj, "until_date", r.readInt());
        return obj;
    }

    private static JsonObject readMessageMediaGiveaway(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaGiveaway");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("only_new_subscribers", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("winners_are_visible", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "channels", r.readVector(TlBinaryReader::readLong));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "countries_iso2", r.readVector(TlBinaryReader::readString));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "prize_description", r.readString());
        }
        JsonUtils.add(obj, "quantity", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "months", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "stars", r.readLong());
        }
        JsonUtils.add(obj, "until_date", r.readInt());
        return obj;
    }

    private static JsonObject readMessageMediaStory(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaStory");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("via_mention", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "story", r.readObject());
        }
        return obj;
    }

    private static JsonObject readStoryItem(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "storyItem");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("pinned", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("public", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("close_friends", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("edited", TLObject.hasFlag(flags, TLObject.FLAG_11));
        obj.addProperty("contacts", TLObject.hasFlag(flags, TLObject.FLAG_12));
        obj.addProperty("selected_contacts", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("out", TLObject.hasFlag(flags, TLObject.FLAG_16));
        JsonUtils.add(obj, "id", r.readInt());
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "fwd_from", r.readObject());
        }
        JsonUtils.add(obj, "expire_date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "caption", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "entities", r.readVector(TlBinaryReader::readObject));
        }
        JsonUtils.add(obj, "media", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "media_areas", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "privacy", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "views", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "sent_reaction", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_19)) {
            JsonUtils.add(obj, "albums", r.readVector(TlBinaryReader::readInt));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            JsonUtils.add(obj, "music", r.readObject());
        }
        return obj;
    }

    private static JsonObject readReactionPaid(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "reactionPaid");
        return obj;
    }

    private static JsonObject readReactionCustomEmoji(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "reactionCustomEmoji");
        JsonUtils.add(obj, "document_id", r.readLong());
        return obj;
    }

    private static JsonObject readReactionEmoji(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "reactionEmoji");
        JsonUtils.add(obj, "emoticon", r.readString());
        return obj;
    }

    private static JsonObject readReactionEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "reactionEmpty");
        return obj;
    }

    private static JsonObject readStoryViews(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "storyViews");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("has_viewers", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "views_count", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "forwards_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "reactions", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "reactions_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "recent_viewers", r.readVector(TlBinaryReader::readLong));
        }
        return obj;
    }

    private static JsonObject readReactionCount(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "reactionCount");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "chosen_order", r.readInt());
        }
        JsonUtils.add(obj, "reaction", r.readObject());
        JsonUtils.add(obj, "count", r.readInt());
        return obj;
    }

    private static JsonObject readPrivacyValueDisallowBots(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueDisallowBots");
        return obj;
    }

    private static JsonObject readPrivacyValueAllowBots(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueAllowBots");
        return obj;
    }

    private static JsonObject readPrivacyValueAllowPremium(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueAllowPremium");
        return obj;
    }

    private static JsonObject readPrivacyValueAllowCloseFriends(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueAllowCloseFriends");
        return obj;
    }

    private static JsonObject readPrivacyValueDisallowChatParticipants(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueDisallowChatParticipants");
        JsonUtils.add(obj, "chats", r.readVector(TlBinaryReader::readLong));
        return obj;
    }

    private static JsonObject readPrivacyValueAllowChatParticipants(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueAllowChatParticipants");
        JsonUtils.add(obj, "chats", r.readVector(TlBinaryReader::readLong));
        return obj;
    }

    private static JsonObject readPrivacyValueDisallowUsers(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueDisallowUsers");
        JsonUtils.add(obj, "users", r.readVector(TlBinaryReader::readLong));
        return obj;
    }

    private static JsonObject readPrivacyValueDisallowAll(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueDisallowAll");
        return obj;
    }

    private static JsonObject readPrivacyValueDisallowContacts(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueDisallowContacts");
        return obj;
    }

    private static JsonObject readPrivacyValueAllowUsers(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueAllowUsers");
        JsonUtils.add(obj, "users", r.readVector(TlBinaryReader::readLong));
        return obj;
    }

    private static JsonObject readPrivacyValueAllowAll(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueAllowAll");
        return obj;
    }

    private static JsonObject readPrivacyValueAllowContacts(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "privacyValueAllowContacts");
        return obj;
    }

    private static JsonObject readMediaAreaStarGift(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "mediaAreaStarGift");
        JsonUtils.add(obj, "coordinates", r.readObject());
        JsonUtils.add(obj, "slug", r.readString());
        return obj;
    }

    private static JsonObject readMediaAreaCoordinates(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "mediaAreaCoordinates");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "x", r.readDouble());
        JsonUtils.add(obj, "y", r.readDouble());
        JsonUtils.add(obj, "w", r.readDouble());
        JsonUtils.add(obj, "h", r.readDouble());
        JsonUtils.add(obj, "rotation", r.readDouble());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "radius", r.readDouble());
        }
        return obj;
    }

    private static JsonObject readMediaAreaWeather(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "mediaAreaWeather");
        JsonUtils.add(obj, "coordinates", r.readObject());
        JsonUtils.add(obj, "emoji", r.readString());
        JsonUtils.add(obj, "temperature_c", r.readDouble());
        JsonUtils.add(obj, "color", r.readInt());
        return obj;
    }

    private static JsonObject readMediaAreaUrl(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "mediaAreaUrl");
        JsonUtils.add(obj, "coordinates", r.readObject());
        JsonUtils.add(obj, "url", r.readString());
        return obj;
    }

    private static JsonObject readInputMediaAreaChannelPost(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaAreaChannelPost");
        JsonUtils.add(obj, "coordinates", r.readObject());
        JsonUtils.add(obj, "channel", r.readObject());
        JsonUtils.add(obj, "msg_id", r.readInt());
        return obj;
    }

    private static JsonObject readMediaAreaChannelPost(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "mediaAreaChannelPost");
        JsonUtils.add(obj, "coordinates", r.readObject());
        JsonUtils.add(obj, "channel_id", r.readLong());
        JsonUtils.add(obj, "msg_id", r.readInt());
        return obj;
    }

    private static JsonObject readMediaAreaSuggestedReaction(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "mediaAreaSuggestedReaction");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("dark", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("flipped", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "coordinates", r.readObject());
        JsonUtils.add(obj, "reaction", r.readObject());
        return obj;
    }

    private static JsonObject readMediaAreaGeoPoint(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "mediaAreaGeoPoint");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "coordinates", r.readObject());
        JsonUtils.add(obj, "geo", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "address", r.readObject());
        }
        return obj;
    }

    private static JsonObject readGeoPointAddress(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "geoPointAddress");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "country_iso2", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "state", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "city", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "street", r.readString());
        }
        return obj;
    }

    private static JsonObject readInputMediaAreaVenue(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputMediaAreaVenue");
        JsonUtils.add(obj, "coordinates", r.readObject());
        JsonUtils.add(obj, "query_id", r.readLong());
        JsonUtils.add(obj, "result_id", r.readString());
        return obj;
    }

    private static JsonObject readMediaAreaVenue(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "mediaAreaVenue");
        JsonUtils.add(obj, "coordinates", r.readObject());
        JsonUtils.add(obj, "geo", r.readObject());
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "address", r.readString());
        JsonUtils.add(obj, "provider", r.readString());
        JsonUtils.add(obj, "venue_id", r.readString());
        JsonUtils.add(obj, "venue_type", r.readString());
        return obj;
    }

    private static JsonObject readMessageMediaDice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaDice");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "value", r.readInt());
        JsonUtils.add(obj, "emoticon", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "game_outcome", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMessages_emojiGameOutcome(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messages.emojiGameOutcome");
        JsonUtils.add(obj, "seed", r.readBytes());
        JsonUtils.add(obj, "stake_ton_amount", r.readLong());
        JsonUtils.add(obj, "ton_amount", r.readLong());
        return obj;
    }

    private static JsonObject readMessageMediaPoll(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaPoll");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "poll", r.readObject());
        JsonUtils.add(obj, "results", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "attached_media", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMessageMediaGeoLive(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaGeoLive");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "geo", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "heading", r.readInt());
        }
        JsonUtils.add(obj, "period", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "proximity_notification_radius", r.readInt());
        }
        return obj;
    }

    private static JsonObject readMessageMediaInvoice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaInvoice");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("shipping_address_requested", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("test", TLObject.hasFlag(flags, TLObject.FLAG_3));
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "description", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "receipt_msg_id", r.readInt());
        }
        JsonUtils.add(obj, "currency", r.readString());
        JsonUtils.add(obj, "total_amount", r.readLong());
        JsonUtils.add(obj, "start_param", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "extended_media", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMessageExtendedMediaPreview(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageExtendedMediaPreview");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "w", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "h", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "thumb", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "video_duration", r.readInt());
        }
        return obj;
    }

    private static JsonObject readWebDocumentNoProxy(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webDocumentNoProxy");
        JsonUtils.add(obj, "url", r.readString());
        JsonUtils.add(obj, "size", r.readInt());
        JsonUtils.add(obj, "mime_type", r.readString());
        JsonUtils.add(obj, "attributes", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readWebDocument(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webDocument");
        JsonUtils.add(obj, "url", r.readString());
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "size", r.readInt());
        JsonUtils.add(obj, "mime_type", r.readString());
        JsonUtils.add(obj, "attributes", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readMessageMediaGame(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaGame");
        JsonUtils.add(obj, "game", r.readObject());
        return obj;
    }

    private static JsonObject readGame(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "game");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "short_name", r.readString());
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "description", r.readString());
        JsonUtils.add(obj, "photo", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "document", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMessageMediaVenue(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaVenue");
        JsonUtils.add(obj, "geo", r.readObject());
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "address", r.readString());
        JsonUtils.add(obj, "provider", r.readString());
        JsonUtils.add(obj, "venue_id", r.readString());
        JsonUtils.add(obj, "venue_type", r.readString());
        return obj;
    }

    private static JsonObject readMessageMediaWebPage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaWebPage");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("force_large_media", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("force_small_media", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("manual", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("safe", TLObject.hasFlag(flags, TLObject.FLAG_4));
        JsonUtils.add(obj, "webpage", r.readObject());
        return obj;
    }

    private static JsonObject readWebPageNotModified(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPageNotModified");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "cached_page_views", r.readInt());
        }
        return obj;
    }

    private static JsonObject readWebPage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPage");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("has_large_media", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("video_cover_photo", TLObject.hasFlag(flags, TLObject.FLAG_14));
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "url", r.readString());
        JsonUtils.add(obj, "display_url", r.readString());
        JsonUtils.add(obj, "hash", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "type", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "site_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "description", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "embed_url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "embed_type", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "embed_width", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "embed_height", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "duration", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "document", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "cached_page", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "attributes", r.readVector(TlBinaryReader::readObject));
        }
        return obj;
    }

    private static JsonObject readWebPageAttributeAiComposeTone(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPageAttributeAiComposeTone");
        JsonUtils.add(obj, "emoji_id", r.readLong());
        return obj;
    }

    private static JsonObject readWebPageAttributeStarGiftAuction(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPageAttributeStarGiftAuction");
        JsonUtils.add(obj, "gift", r.readObject());
        JsonUtils.add(obj, "end_date", r.readInt());
        return obj;
    }

    private static JsonObject readStarGiftUnique(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftUnique");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("require_premium", TLObject.hasFlag(flags, TLObject.FLAG_6));
        obj.addProperty("resale_ton_only", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("theme_available", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("burned", TLObject.hasFlag(flags, TLObject.FLAG_14));
        obj.addProperty("crafted", TLObject.hasFlag(flags, TLObject.FLAG_15));
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "gift_id", r.readLong());
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "slug", r.readString());
        JsonUtils.add(obj, "num", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "owner_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "owner_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "owner_address", r.readString());
        }
        JsonUtils.add(obj, "attributes", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "availability_issued", r.readInt());
        JsonUtils.add(obj, "availability_total", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "gift_address", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "resell_amount", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "released_by", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "value_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "value_currency", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "value_usd_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "theme_peer", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "peer_color", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "host_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "offer_min_stars", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            JsonUtils.add(obj, "craft_chance_permille", r.readInt());
        }
        return obj;
    }

    private static JsonObject readStarGiftAttributeOriginalDetails(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftAttributeOriginalDetails");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "sender_id", r.readObject());
        }
        JsonUtils.add(obj, "recipient_id", r.readObject());
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "message", r.readObject());
        }
        return obj;
    }

    private static JsonObject readStarGiftAttributeBackdrop(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftAttributeBackdrop");
        JsonUtils.add(obj, "name", r.readString());
        JsonUtils.add(obj, "backdrop_id", r.readInt());
        JsonUtils.add(obj, "center_color", r.readInt());
        JsonUtils.add(obj, "edge_color", r.readInt());
        JsonUtils.add(obj, "pattern_color", r.readInt());
        JsonUtils.add(obj, "text_color", r.readInt());
        JsonUtils.add(obj, "rarity", r.readObject());
        return obj;
    }

    private static JsonObject readStarGiftAttributeRarityLegendary(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftAttributeRarityLegendary");
        return obj;
    }

    private static JsonObject readStarGiftAttributeRarityEpic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftAttributeRarityEpic");
        return obj;
    }

    private static JsonObject readStarGiftAttributeRarityRare(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftAttributeRarityRare");
        return obj;
    }

    private static JsonObject readStarGiftAttributeRarityUncommon(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftAttributeRarityUncommon");
        return obj;
    }

    private static JsonObject readStarGiftAttributeRarity(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftAttributeRarity");
        JsonUtils.add(obj, "permille", r.readInt());
        return obj;
    }

    private static JsonObject readStarGiftAttributePattern(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftAttributePattern");
        JsonUtils.add(obj, "name", r.readString());
        JsonUtils.add(obj, "document", r.readObject());
        JsonUtils.add(obj, "rarity", r.readObject());
        return obj;
    }

    private static JsonObject readStarGiftAttributeModel(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftAttributeModel");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("crafted", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "name", r.readString());
        JsonUtils.add(obj, "document", r.readObject());
        JsonUtils.add(obj, "rarity", r.readObject());
        return obj;
    }

    private static JsonObject readStarGift(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGift");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("limited", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("sold_out", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("birthday", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("require_premium", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("limited_per_user", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("peer_color_available", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("auction", TLObject.hasFlag(flags, TLObject.FLAG_11));
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "sticker", r.readObject());
        JsonUtils.add(obj, "stars", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "availability_remains", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "availability_total", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "availability_resale", r.readLong());
        }
        JsonUtils.add(obj, "convert_stars", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "first_sale_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "last_sale_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "upgrade_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "resell_min_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "released_by", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "per_user_total", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "per_user_remains", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "locked_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "auction_slug", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "gifts_per_round", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "auction_start_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "upgrade_variants", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "background", r.readObject());
        }
        return obj;
    }

    private static JsonObject readStarGiftBackground(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starGiftBackground");
        JsonUtils.add(obj, "center_color", r.readInt());
        JsonUtils.add(obj, "edge_color", r.readInt());
        JsonUtils.add(obj, "text_color", r.readInt());
        return obj;
    }

    private static JsonObject readWebPageAttributeStarGiftCollection(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPageAttributeStarGiftCollection");
        JsonUtils.add(obj, "icons", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readWebPageAttributeUniqueStarGift(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPageAttributeUniqueStarGift");
        JsonUtils.add(obj, "gift", r.readObject());
        return obj;
    }

    private static JsonObject readWebPageAttributeStickerSet(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPageAttributeStickerSet");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("emojis", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("text_color", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "stickers", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readWebPageAttributeStory(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPageAttributeStory");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "story", r.readObject());
        }
        return obj;
    }

    private static JsonObject readStoryItemSkipped(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "storyItemSkipped");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("close_friends", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("live", TLObject.hasFlag(flags, TLObject.FLAG_9));
        JsonUtils.add(obj, "id", r.readInt());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "expire_date", r.readInt());
        return obj;
    }

    private static JsonObject readStoryItemDeleted(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "storyItemDeleted");
        JsonUtils.add(obj, "id", r.readInt());
        return obj;
    }

    private static JsonObject readWebPageAttributeTheme(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPageAttributeTheme");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "documents", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "settings", r.readObject());
        }
        return obj;
    }

    private static JsonObject readThemeSettings(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "themeSettings");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("message_colors_animated", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "base_theme", r.readObject());
        JsonUtils.add(obj, "accent_color", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "outbox_accent_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "message_colors", r.readVector(TlBinaryReader::readInt));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "wallpaper", r.readObject());
        }
        return obj;
    }

    private static JsonObject readBaseThemeArctic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "baseThemeArctic");
        return obj;
    }

    private static JsonObject readBaseThemeTinted(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "baseThemeTinted");
        return obj;
    }

    private static JsonObject readBaseThemeNight(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "baseThemeNight");
        return obj;
    }

    private static JsonObject readBaseThemeDay(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "baseThemeDay");
        return obj;
    }

    private static JsonObject readBaseThemeClassic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "baseThemeClassic");
        return obj;
    }

    private static JsonObject readPage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "page");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("part", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("rtl", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("v2", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "url", r.readString());
        JsonUtils.add(obj, "blocks", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "photos", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "documents", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "views", r.readInt());
        }
        return obj;
    }

    private static JsonObject readWebPagePending(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPagePending");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "url", r.readString());
        }
        JsonUtils.add(obj, "date", r.readInt());
        return obj;
    }

    private static JsonObject readWebPageEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "webPageEmpty");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "url", r.readString());
        }
        return obj;
    }

    private static JsonObject readMessageMediaDocument(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaDocument");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("nopremium", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("video", TLObject.hasFlag(flags, TLObject.FLAG_6));
        obj.addProperty("round", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("voice", TLObject.hasFlag(flags, TLObject.FLAG_8));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "document", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "alt_documents", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "video_cover", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "video_timestamp", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "ttl_seconds", r.readInt());
        }
        return obj;
    }

    private static JsonObject readMessageMediaUnsupported(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaUnsupported");
        return obj;
    }

    private static JsonObject readMessageMediaContact(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaContact");
        JsonUtils.add(obj, "phone_number", r.readString());
        JsonUtils.add(obj, "first_name", r.readString());
        JsonUtils.add(obj, "last_name", r.readString());
        JsonUtils.add(obj, "vcard", r.readString());
        JsonUtils.add(obj, "user_id", r.readLong());
        return obj;
    }

    private static JsonObject readMessageMediaGeo(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaGeo");
        JsonUtils.add(obj, "geo", r.readObject());
        return obj;
    }

    private static JsonObject readMessageMediaPhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaPhoto");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("live_photo", TLObject.hasFlag(flags, TLObject.FLAG_4));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "ttl_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "video", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMessageMediaEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaEmpty");
        return obj;
    }

    private static JsonObject readPollResults(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pollResults");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("has_unread_votes", TLObject.hasFlag(flags, TLObject.FLAG_6));
        obj.addProperty("can_view_stats", TLObject.hasFlag(flags, TLObject.FLAG_7));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "results", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "total_voters", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "recent_voters", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "solution", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "solution_entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "solution_media", r.readObject());
        }
        return obj;
    }

    private static JsonObject readPollAnswerVoters(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pollAnswerVoters");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("chosen", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("correct", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "option", r.readBytes());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "voters", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "recent_voters", r.readVector(TlBinaryReader::readObject));
        }
        return obj;
    }

    private static JsonObject readStoryFwdHeader(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "storyFwdHeader");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("modified", TLObject.hasFlag(flags, TLObject.FLAG_3));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "from_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "story_id", r.readInt());
        }
        return obj;
    }

    private static JsonObject readInputReplyToMonoForum(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputReplyToMonoForum");
        JsonUtils.add(obj, "monoforum_peer_id", r.readObject());
        return obj;
    }

    private static JsonObject readInputReplyToStory(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputReplyToStory");
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "story_id", r.readInt());
        return obj;
    }

    private static JsonObject readInputReplyToMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputReplyToMessage");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "reply_to_msg_id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "top_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "reply_to_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "quote_text", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "quote_entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "quote_offset", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "monoforum_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "todo_item_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "poll_option", r.readBytes());
        }
        return obj;
    }

    private static JsonObject readDraftMessageEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "draftMessageEmpty");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "date", r.readInt());
        }
        return obj;
    }

    private static JsonObject readPeerNotifySettings(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "peerNotifySettings");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "show_previews", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "silent", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "mute_until", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "ios_sound", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "android_sound", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "other_sound", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "stories_muted", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "stories_hide_sender", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "stories_ios_sound", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "stories_android_sound", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "stories_other_sound", r.readObject());
        }
        return obj;
    }

    private static JsonObject readNotificationSoundRingtone(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "notificationSoundRingtone");
        JsonUtils.add(obj, "id", r.readLong());
        return obj;
    }

    private static JsonObject readNotificationSoundLocal(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "notificationSoundLocal");
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "data", r.readString());
        return obj;
    }

    private static JsonObject readNotificationSoundNone(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "notificationSoundNone");
        return obj;
    }

    private static JsonObject readNotificationSoundDefault(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "notificationSoundDefault");
        return obj;
    }

    private static JsonObject readForumTopicDeleted(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "forumTopicDeleted");
        JsonUtils.add(obj, "id", r.readInt());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionDeleteTopic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionDeleteTopic");
        JsonUtils.add(obj, "topic", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionEditTopic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionEditTopic");
        JsonUtils.add(obj, "prev_topic", r.readObject());
        JsonUtils.add(obj, "new_topic", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionCreateTopic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionCreateTopic");
        JsonUtils.add(obj, "topic", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionToggleForum(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionToggleForum");
        JsonUtils.add(obj, "new_value", r.readBoolean());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeUsernames(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeUsernames");
        JsonUtils.add(obj, "prev_value", r.readVector(TlBinaryReader::readString));
        JsonUtils.add(obj, "new_value", r.readVector(TlBinaryReader::readString));
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeAvailableReactions(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeAvailableReactions");
        JsonUtils.add(obj, "prev_value", r.readObject());
        JsonUtils.add(obj, "new_value", r.readObject());
        return obj;
    }

    private static JsonObject readChatReactionsSome(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatReactionsSome");
        JsonUtils.add(obj, "reactions", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readChatReactionsAll(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatReactionsAll");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("allow_custom", TLObject.hasFlag(flags, TLObject.FLAG_0));
        return obj;
    }

    private static JsonObject readChatReactionsNone(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatReactionsNone");
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionSendMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionSendMessage");
        JsonUtils.add(obj, "message", r.readObject());
        return obj;
    }

    private static JsonObject readMessageService(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageService");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("out", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("mentioned", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("media_unread", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("reactions_are_possible", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("silent", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("post", TLObject.hasFlag(flags, TLObject.FLAG_14));
        obj.addProperty("legacy", TLObject.hasFlag(flags, TLObject.FLAG_19));
        JsonUtils.add(obj, "id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "from_id", r.readObject());
        }
        JsonUtils.add(obj, "peer_id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            JsonUtils.add(obj, "saved_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "reply_to", r.readObject());
        }
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "action", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            JsonUtils.add(obj, "reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            JsonUtils.add(obj, "ttl_period", r.readInt());
        }
        return obj;
    }

    private static JsonObject readMessageReactions(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageReactions");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("can_see_list", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("reactions_as_tags", TLObject.hasFlag(flags, TLObject.FLAG_3));
        JsonUtils.add(obj, "results", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "recent_reactions", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "top_reactors", r.readVector(TlBinaryReader::readObject));
        }
        return obj;
    }

    private static JsonObject readMessageReactor(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageReactor");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("top", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("my", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("anonymous", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "peer_id", r.readObject());
        }
        JsonUtils.add(obj, "count", r.readInt());
        return obj;
    }

    private static JsonObject readMessagePeerReaction(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messagePeerReaction");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("big", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("unread", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("my", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "peer_id", r.readObject());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "reaction", r.readObject());
        return obj;
    }

    private static JsonObject readMessageActionManagedBotCreated(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionManagedBotCreated");
        JsonUtils.add(obj, "bot_id", r.readLong());
        return obj;
    }

    private static JsonObject readMessageActionPollDeleteAnswer(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionPollDeleteAnswer");
        JsonUtils.add(obj, "answer", r.readObject());
        return obj;
    }

    private static JsonObject readMessageActionPollAppendAnswer(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionPollAppendAnswer");
        JsonUtils.add(obj, "answer", r.readObject());
        return obj;
    }

    private static JsonObject readMessageActionNoForwardsRequest(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionNoForwardsRequest");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("expired", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "prev_value", r.readBoolean());
        JsonUtils.add(obj, "new_value", r.readBoolean());
        return obj;
    }

    private static JsonObject readMessageActionNoForwardsToggle(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionNoForwardsToggle");
        JsonUtils.add(obj, "prev_value", r.readBoolean());
        JsonUtils.add(obj, "new_value", r.readBoolean());
        return obj;
    }

    private static JsonObject readMessageActionChangeCreator(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChangeCreator");
        JsonUtils.add(obj, "new_creator_id", r.readLong());
        return obj;
    }

    private static JsonObject readMessageActionNewCreatorPending(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionNewCreatorPending");
        JsonUtils.add(obj, "new_creator_id", r.readLong());
        return obj;
    }

    private static JsonObject readMessageActionStarGiftPurchaseOfferDeclined(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionStarGiftPurchaseOfferDeclined");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("expired", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "gift", r.readObject());
        JsonUtils.add(obj, "price", r.readObject());
        return obj;
    }

    private static JsonObject readMessageActionStarGiftPurchaseOffer(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionStarGiftPurchaseOffer");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("accepted", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("declined", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "gift", r.readObject());
        JsonUtils.add(obj, "price", r.readObject());
        JsonUtils.add(obj, "expires_at", r.readInt());
        return obj;
    }

    private static JsonObject readMessageActionSuggestBirthday(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionSuggestBirthday");
        JsonUtils.add(obj, "birthday", r.readObject());
        return obj;
    }

    private static JsonObject readBirthday(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "birthday");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "day", r.readInt());
        JsonUtils.add(obj, "month", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "year", r.readInt());
        }
        return obj;
    }

    private static JsonObject readMessageActionGiftTon(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionGiftTon");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "currency", r.readString());
        JsonUtils.add(obj, "amount", r.readLong());
        JsonUtils.add(obj, "crypto_currency", r.readString());
        JsonUtils.add(obj, "crypto_amount", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "transaction_id", r.readString());
        }
        return obj;
    }

    private static JsonObject readMessageActionSuggestedPostRefund(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionSuggestedPostRefund");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("payer_initiated", TLObject.hasFlag(flags, TLObject.FLAG_0));
        return obj;
    }

    private static JsonObject readMessageActionSuggestedPostSuccess(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionSuggestedPostSuccess");
        JsonUtils.add(obj, "price", r.readObject());
        return obj;
    }

    private static JsonObject readMessageActionSuggestedPostApproval(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionSuggestedPostApproval");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("rejected", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("balance_too_low", TLObject.hasFlag(flags, TLObject.FLAG_1));
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "reject_comment", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "schedule_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "price", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMessageActionTodoAppendTasks(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionTodoAppendTasks");
        JsonUtils.add(obj, "list", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readMessageActionTodoCompletions(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionTodoCompletions");
        JsonUtils.add(obj, "completed", r.readVector(TlBinaryReader::readInt));
        JsonUtils.add(obj, "incompleted", r.readVector(TlBinaryReader::readInt));
        return obj;
    }

    private static JsonObject readMessageActionConferenceCall(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionConferenceCall");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("missed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("active", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("video", TLObject.hasFlag(flags, TLObject.FLAG_4));
        JsonUtils.add(obj, "call_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "duration", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "other_participants", r.readVector(TlBinaryReader::readObject));
        }
        return obj;
    }

    private static JsonObject readMessageActionPaidMessagesPrice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionPaidMessagesPrice");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("broadcast_messages_allowed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "stars", r.readLong());
        return obj;
    }

    private static JsonObject readMessageActionPaidMessagesRefunded(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionPaidMessagesRefunded");
        JsonUtils.add(obj, "count", r.readInt());
        JsonUtils.add(obj, "stars", r.readLong());
        return obj;
    }

    private static JsonObject readMessageActionStarGiftUnique(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionStarGiftUnique");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("upgrade", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("transferred", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("saved", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("refunded", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("prepaid_upgrade", TLObject.hasFlag(flags, TLObject.FLAG_11));
        obj.addProperty("assigned", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("from_offer", TLObject.hasFlag(flags, TLObject.FLAG_14));
        obj.addProperty("craft", TLObject.hasFlag(flags, TLObject.FLAG_16));
        JsonUtils.add(obj, "gift", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "can_export_at", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "transfer_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "peer", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "saved_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "resale_amount", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "can_transfer_at", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "can_resell_at", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "drop_original_details_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "can_craft_at", r.readInt());
        }
        return obj;
    }

    private static JsonObject readMessageActionStarGift(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionStarGift");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("name_hidden", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("saved", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("converted", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("upgraded", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("refunded", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("can_upgrade", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("prepaid_upgrade", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("upgrade_separate", TLObject.hasFlag(flags, TLObject.FLAG_16));
        obj.addProperty("auction_acquired", TLObject.hasFlag(flags, TLObject.FLAG_17));
        JsonUtils.add(obj, "gift", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "message", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "convert_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "upgrade_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "upgrade_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "peer", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "saved_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "prepaid_upgrade_hash", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "gift_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "to_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_19)) {
            JsonUtils.add(obj, "gift_num", r.readInt());
        }
        return obj;
    }

    private static JsonObject readMessageActionPrizeStars(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionPrizeStars");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("unclaimed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "stars", r.readLong());
        JsonUtils.add(obj, "transaction_id", r.readString());
        JsonUtils.add(obj, "boost_peer", r.readObject());
        JsonUtils.add(obj, "giveaway_msg_id", r.readInt());
        return obj;
    }

    private static JsonObject readMessageActionGiftStars(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionGiftStars");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "currency", r.readString());
        JsonUtils.add(obj, "amount", r.readLong());
        JsonUtils.add(obj, "stars", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "crypto_currency", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "crypto_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "transaction_id", r.readString());
        }
        return obj;
    }

    private static JsonObject readMessageActionPaymentRefunded(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionPaymentRefunded");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "currency", r.readString());
        JsonUtils.add(obj, "total_amount", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "payload", r.readBytes());
        }
        JsonUtils.add(obj, "charge", r.readObject());
        return obj;
    }

    private static JsonObject readPaymentCharge(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "paymentCharge");
        JsonUtils.add(obj, "id", r.readString());
        JsonUtils.add(obj, "provider_charge_id", r.readString());
        return obj;
    }

    private static JsonObject readMessageActionRequestedPeerSentMe(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionRequestedPeerSentMe");
        JsonUtils.add(obj, "button_id", r.readInt());
        JsonUtils.add(obj, "peers", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readRequestedPeerChannel(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "requestedPeerChannel");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "channel_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "username", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "photo", r.readObject());
        }
        return obj;
    }

    private static JsonObject readRequestedPeerChat(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "requestedPeerChat");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "chat_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "photo", r.readObject());
        }
        return obj;
    }

    private static JsonObject readRequestedPeerUser(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "requestedPeerUser");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "user_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "first_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "last_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "username", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "photo", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMessageActionBoostApply(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionBoostApply");
        JsonUtils.add(obj, "boosts", r.readInt());
        return obj;
    }

    private static JsonObject readMessageActionGiveawayResults(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionGiveawayResults");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("stars", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "winners_count", r.readInt());
        JsonUtils.add(obj, "unclaimed_count", r.readInt());
        return obj;
    }

    private static JsonObject readMessageActionGiveawayLaunch(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionGiveawayLaunch");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "stars", r.readLong());
        }
        return obj;
    }

    private static JsonObject readMessageActionGiftCode(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionGiftCode");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("via_giveaway", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("unclaimed", TLObject.hasFlag(flags, TLObject.FLAG_5));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "boost_peer", r.readObject());
        }
        JsonUtils.add(obj, "days", r.readInt());
        JsonUtils.add(obj, "slug", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "currency", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "crypto_currency", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "crypto_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "message", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMessageActionSetChatWallPaper(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionSetChatWallPaper");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("same", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("for_both", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "wallpaper", r.readObject());
        return obj;
    }

    private static JsonObject readMessageActionRequestedPeer(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionRequestedPeer");
        JsonUtils.add(obj, "button_id", r.readInt());
        JsonUtils.add(obj, "peers", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readMessageActionSuggestProfilePhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionSuggestProfilePhoto");
        JsonUtils.add(obj, "photo", r.readObject());
        return obj;
    }

    private static JsonObject readMessageActionTopicEdit(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionTopicEdit");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "icon_emoji_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "closed", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "hidden", r.readBoolean());
        }
        return obj;
    }

    private static JsonObject readMessageActionTopicCreate(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionTopicCreate");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("title_missing", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "icon_color", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "icon_emoji_id", r.readLong());
        }
        return obj;
    }

    private static JsonObject readMessageActionGiftPremium(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionGiftPremium");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "currency", r.readString());
        JsonUtils.add(obj, "amount", r.readLong());
        JsonUtils.add(obj, "days", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "crypto_currency", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "crypto_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "message", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMessageActionWebViewDataSent(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionWebViewDataSent");
        JsonUtils.add(obj, "text", r.readString());
        return obj;
    }

    private static JsonObject readMessageActionWebViewDataSentMe(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionWebViewDataSentMe");
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "data", r.readString());
        return obj;
    }

    private static JsonObject readMessageActionChatJoinedByRequest(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChatJoinedByRequest");
        return obj;
    }

    private static JsonObject readMessageActionSetChatTheme(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionSetChatTheme");
        JsonUtils.add(obj, "theme", r.readObject());
        return obj;
    }

    private static JsonObject readChatThemeUniqueGift(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatThemeUniqueGift");
        JsonUtils.add(obj, "gift", r.readObject());
        JsonUtils.add(obj, "theme_settings", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readChatTheme(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatTheme");
        JsonUtils.add(obj, "emoticon", r.readString());
        return obj;
    }

    private static JsonObject readMessageActionGroupCallScheduled(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionGroupCallScheduled");
        JsonUtils.add(obj, "call", r.readObject());
        JsonUtils.add(obj, "schedule_date", r.readInt());
        return obj;
    }

    private static JsonObject readMessageActionSetMessagesTTL(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionSetMessagesTTL");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "period", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "auto_setting_from", r.readLong());
        }
        return obj;
    }

    private static JsonObject readMessageActionInviteToGroupCall(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionInviteToGroupCall");
        JsonUtils.add(obj, "call", r.readObject());
        JsonUtils.add(obj, "users", r.readVector(TlBinaryReader::readLong));
        return obj;
    }

    private static JsonObject readMessageActionGroupCall(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionGroupCall");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "call", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "duration", r.readInt());
        }
        return obj;
    }

    private static JsonObject readMessageActionGeoProximityReached(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionGeoProximityReached");
        JsonUtils.add(obj, "from_id", r.readObject());
        JsonUtils.add(obj, "to_id", r.readObject());
        JsonUtils.add(obj, "distance", r.readInt());
        return obj;
    }

    private static JsonObject readMessageActionContactSignUp(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionContactSignUp");
        return obj;
    }

    private static JsonObject readMessageActionSecureValuesSent(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionSecureValuesSent");
        JsonUtils.add(obj, "types", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readSecureValueTypeEmail(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypeEmail");
        return obj;
    }

    private static JsonObject readSecureValueTypePhone(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypePhone");
        return obj;
    }

    private static JsonObject readSecureValueTypeTemporaryRegistration(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypeTemporaryRegistration");
        return obj;
    }

    private static JsonObject readSecureValueTypePassportRegistration(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypePassportRegistration");
        return obj;
    }

    private static JsonObject readSecureValueTypeRentalAgreement(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypeRentalAgreement");
        return obj;
    }

    private static JsonObject readSecureValueTypeBankStatement(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypeBankStatement");
        return obj;
    }

    private static JsonObject readSecureValueTypeUtilityBill(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypeUtilityBill");
        return obj;
    }

    private static JsonObject readSecureValueTypeAddress(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypeAddress");
        return obj;
    }

    private static JsonObject readSecureValueTypeInternalPassport(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypeInternalPassport");
        return obj;
    }

    private static JsonObject readSecureValueTypeIdentityCard(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypeIdentityCard");
        return obj;
    }

    private static JsonObject readSecureValueTypeDriverLicense(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypeDriverLicense");
        return obj;
    }

    private static JsonObject readSecureValueTypePassport(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypePassport");
        return obj;
    }

    private static JsonObject readSecureValueTypePersonalDetails(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValueTypePersonalDetails");
        return obj;
    }

    private static JsonObject readMessageActionSecureValuesSentMe(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionSecureValuesSentMe");
        JsonUtils.add(obj, "values", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "credentials", r.readObject());
        return obj;
    }

    private static JsonObject readSecureCredentialsEncrypted(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureCredentialsEncrypted");
        JsonUtils.add(obj, "data", r.readBytes());
        JsonUtils.add(obj, "hash", r.readBytes());
        JsonUtils.add(obj, "secret", r.readBytes());
        return obj;
    }

    private static JsonObject readSecureValue(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureValue");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "type", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "data", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "front_side", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "reverse_side", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "selfie", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "translation", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "files", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "plain_data", r.readObject());
        }
        JsonUtils.add(obj, "hash", r.readBytes());
        return obj;
    }

    private static JsonObject readSecurePlainEmail(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "securePlainEmail");
        JsonUtils.add(obj, "email", r.readString());
        return obj;
    }

    private static JsonObject readSecurePlainPhone(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "securePlainPhone");
        JsonUtils.add(obj, "phone", r.readString());
        return obj;
    }

    private static JsonObject readSecureFile(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureFile");
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "size", r.readLong());
        JsonUtils.add(obj, "dc_id", r.readInt());
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "file_hash", r.readBytes());
        JsonUtils.add(obj, "secret", r.readBytes());
        return obj;
    }

    private static JsonObject readSecureFileEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureFileEmpty");
        return obj;
    }

    private static JsonObject readSecureData(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "secureData");
        JsonUtils.add(obj, "data", r.readBytes());
        JsonUtils.add(obj, "data_hash", r.readBytes());
        JsonUtils.add(obj, "secret", r.readBytes());
        return obj;
    }

    private static JsonObject readMessageActionBotAllowed(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionBotAllowed");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("attach_menu", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("from_request", TLObject.hasFlag(flags, TLObject.FLAG_3));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "domain", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "app", r.readObject());
        }
        return obj;
    }

    private static JsonObject readBotApp(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "botApp");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "short_name", r.readString());
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "description", r.readString());
        JsonUtils.add(obj, "photo", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "document", r.readObject());
        }
        JsonUtils.add(obj, "hash", r.readLong());
        return obj;
    }

    private static JsonObject readBotAppNotModified(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "botAppNotModified");
        return obj;
    }

    private static JsonObject readMessageActionCustomAction(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionCustomAction");
        JsonUtils.add(obj, "message", r.readString());
        return obj;
    }

    private static JsonObject readMessageActionScreenshotTaken(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionScreenshotTaken");
        return obj;
    }

    private static JsonObject readMessageActionPhoneCall(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionPhoneCall");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("video", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "call_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "reason", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "duration", r.readInt());
        }
        return obj;
    }

    private static JsonObject readPhoneCallDiscardReasonMigrateConferenceCall(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "phoneCallDiscardReasonMigrateConferenceCall");
        JsonUtils.add(obj, "slug", r.readString());
        return obj;
    }

    private static JsonObject readPhoneCallDiscardReasonBusy(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "phoneCallDiscardReasonBusy");
        return obj;
    }

    private static JsonObject readPhoneCallDiscardReasonHangup(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "phoneCallDiscardReasonHangup");
        return obj;
    }

    private static JsonObject readPhoneCallDiscardReasonDisconnect(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "phoneCallDiscardReasonDisconnect");
        return obj;
    }

    private static JsonObject readPhoneCallDiscardReasonMissed(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "phoneCallDiscardReasonMissed");
        return obj;
    }

    private static JsonObject readMessageActionPaymentSent(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionPaymentSent");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("recurring_init", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("recurring_used", TLObject.hasFlag(flags, TLObject.FLAG_3));
        JsonUtils.add(obj, "currency", r.readString());
        JsonUtils.add(obj, "total_amount", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "invoice_slug", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "subscription_until_date", r.readInt());
        }
        return obj;
    }

    private static JsonObject readMessageActionPaymentSentMe(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionPaymentSentMe");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("recurring_init", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("recurring_used", TLObject.hasFlag(flags, TLObject.FLAG_3));
        JsonUtils.add(obj, "currency", r.readString());
        JsonUtils.add(obj, "total_amount", r.readLong());
        JsonUtils.add(obj, "payload", r.readBytes());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "info", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "shipping_option_id", r.readString());
        }
        JsonUtils.add(obj, "charge", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "subscription_until_date", r.readInt());
        }
        return obj;
    }

    private static JsonObject readPaymentRequestedInfo(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "paymentRequestedInfo");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "phone", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "email", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "shipping_address", r.readObject());
        }
        return obj;
    }

    private static JsonObject readPostAddress(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "postAddress");
        JsonUtils.add(obj, "street_line1", r.readString());
        JsonUtils.add(obj, "street_line2", r.readString());
        JsonUtils.add(obj, "city", r.readString());
        JsonUtils.add(obj, "state", r.readString());
        JsonUtils.add(obj, "country_iso2", r.readString());
        JsonUtils.add(obj, "post_code", r.readString());
        return obj;
    }

    private static JsonObject readMessageActionGameScore(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionGameScore");
        JsonUtils.add(obj, "game_id", r.readLong());
        JsonUtils.add(obj, "score", r.readInt());
        return obj;
    }

    private static JsonObject readMessageActionHistoryClear(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionHistoryClear");
        return obj;
    }

    private static JsonObject readMessageActionPinMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionPinMessage");
        return obj;
    }

    private static JsonObject readMessageActionChannelMigrateFrom(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChannelMigrateFrom");
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "chat_id", r.readLong());
        return obj;
    }

    private static JsonObject readMessageActionChatMigrateTo(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChatMigrateTo");
        JsonUtils.add(obj, "channel_id", r.readLong());
        return obj;
    }

    private static JsonObject readMessageActionChannelCreate(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChannelCreate");
        JsonUtils.add(obj, "title", r.readString());
        return obj;
    }

    private static JsonObject readMessageActionChatJoinedByLink(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChatJoinedByLink");
        JsonUtils.add(obj, "inviter_id", r.readLong());
        return obj;
    }

    private static JsonObject readMessageActionChatDeleteUser(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChatDeleteUser");
        JsonUtils.add(obj, "user_id", r.readLong());
        return obj;
    }

    private static JsonObject readMessageActionChatAddUser(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChatAddUser");
        JsonUtils.add(obj, "users", r.readVector(TlBinaryReader::readLong));
        return obj;
    }

    private static JsonObject readMessageActionChatDeletePhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChatDeletePhoto");
        return obj;
    }

    private static JsonObject readMessageActionChatEditPhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChatEditPhoto");
        JsonUtils.add(obj, "photo", r.readObject());
        return obj;
    }

    private static JsonObject readMessageActionChatEditTitle(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChatEditTitle");
        JsonUtils.add(obj, "title", r.readString());
        return obj;
    }

    private static JsonObject readMessageActionChatCreate(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionChatCreate");
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "users", r.readVector(TlBinaryReader::readLong));
        return obj;
    }

    private static JsonObject readMessageActionEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageActionEmpty");
        return obj;
    }

    private static JsonObject readMessageReplyStoryHeader(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageReplyStoryHeader");
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "story_id", r.readInt());
        return obj;
    }

    private static JsonObject readMessageReplyHeader(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageReplyHeader");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("reply_to_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("forum_topic", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("quote", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("reply_to_ephemeral", TLObject.hasFlag(flags, TLObject.FLAG_13));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "reply_to_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "reply_to_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "reply_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "reply_media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "reply_to_top_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "quote_text", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "quote_entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "quote_offset", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "todo_item_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "poll_option", r.readBytes());
        }
        return obj;
    }

    private static JsonObject readMessageFwdHeader(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageFwdHeader");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("imported", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("saved_out", TLObject.hasFlag(flags, TLObject.FLAG_11));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "from_name", r.readString());
        }
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "channel_post", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "post_author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "saved_from_peer", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "saved_from_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "saved_from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "saved_from_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "saved_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "psa_type", r.readString());
        }
        return obj;
    }

    private static JsonObject readMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "message");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("out", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("mentioned", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("media_unread", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("silent", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("post", TLObject.hasFlag(flags, TLObject.FLAG_14));
        obj.addProperty("from_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_18));
        obj.addProperty("legacy", TLObject.hasFlag(flags, TLObject.FLAG_19));
        obj.addProperty("edit_hide", TLObject.hasFlag(flags, TLObject.FLAG_21));
        obj.addProperty("pinned", TLObject.hasFlag(flags, TLObject.FLAG_24));
        obj.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_26));
        obj.addProperty("invert_media", TLObject.hasFlag(flags, TLObject.FLAG_27));
        var flags2 = r.readInt();
        obj.addProperty("flags2", flags2);
        obj.addProperty("offline", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        obj.addProperty("video_processing_pending", TLObject.hasFlag(flags2, TLObject.FLAG_4));
        obj.addProperty("paid_suggested_post_stars", TLObject.hasFlag(flags2, TLObject.FLAG_8));
        obj.addProperty("paid_suggested_post_ton", TLObject.hasFlag(flags2, TLObject.FLAG_9));
        JsonUtils.add(obj, "id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_29)) {
            JsonUtils.add(obj, "from_boosts_applied", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "from_rank", r.readString());
        }
        JsonUtils.add(obj, "peer_id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            JsonUtils.add(obj, "saved_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "fwd_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "via_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "via_business_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_19)) {
            JsonUtils.add(obj, "guestchat_via_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "reply_to", r.readObject());
        }
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "message", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "reply_markup", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "views", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "forwards", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_23)) {
            JsonUtils.add(obj, "replies", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "edit_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            JsonUtils.add(obj, "post_author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "grouped_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            JsonUtils.add(obj, "reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            JsonUtils.add(obj, "restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            JsonUtils.add(obj, "ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            JsonUtils.add(obj, "quick_reply_shortcut_id", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "effect", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "factcheck", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "report_delivery_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "paid_message_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "suggested_post", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "schedule_repeat_period", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "summary_from_language", r.readString());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "rich_message", r.readObject());
        }
        return obj;
    }

    private static JsonObject readFactCheck(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "factCheck");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("need_check", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "country", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "text", r.readObject());
        }
        JsonUtils.add(obj, "hash", r.readLong());
        return obj;
    }

    private static JsonObject readMessageReplies(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageReplies");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("comments", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "replies", r.readInt());
        JsonUtils.add(obj, "replies_pts", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "recent_repliers", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "channel_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "max_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "read_max_id", r.readInt());
        }
        return obj;
    }

    private static JsonObject readReplyInlineMarkup(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "replyInlineMarkup");
        JsonUtils.add(obj, "rows", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readKeyboardButtonRow(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonRow");
        JsonUtils.add(obj, "buttons", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readKeyboardButtonCopy(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonCopy");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "copy_text", r.readString());
        return obj;
    }

    private static JsonObject readKeyboardButtonStyle(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonStyle");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("bg_primary", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("bg_danger", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("bg_success", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "icon", r.readLong());
        }
        return obj;
    }

    private static JsonObject readInputKeyboardButtonRequestPeer(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputKeyboardButtonRequestPeer");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("name_requested", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("username_requested", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("photo_requested", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "button_id", r.readInt());
        JsonUtils.add(obj, "peer_type", r.readObject());
        JsonUtils.add(obj, "max_quantity", r.readInt());
        return obj;
    }

    private static JsonObject readRequestPeerTypeCreateBot(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "requestPeerTypeCreateBot");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("bot_managed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "suggested_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "suggested_username", r.readString());
        }
        return obj;
    }

    private static JsonObject readRequestPeerTypeBroadcast(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "requestPeerTypeBroadcast");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "has_username", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "user_admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "bot_admin_rights", r.readObject());
        }
        return obj;
    }

    private static JsonObject readRequestPeerTypeChat(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "requestPeerTypeChat");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("bot_participant", TLObject.hasFlag(flags, TLObject.FLAG_5));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "has_username", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "forum", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "user_admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "bot_admin_rights", r.readObject());
        }
        return obj;
    }

    private static JsonObject readRequestPeerTypeUser(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "requestPeerTypeUser");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "bot", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "premium", r.readBoolean());
        }
        return obj;
    }

    private static JsonObject readKeyboardButtonRequestPeer(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonRequestPeer");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "button_id", r.readInt());
        JsonUtils.add(obj, "peer_type", r.readObject());
        JsonUtils.add(obj, "max_quantity", r.readInt());
        return obj;
    }

    private static JsonObject readKeyboardButtonSimpleWebView(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonSimpleWebView");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "url", r.readString());
        return obj;
    }

    private static JsonObject readKeyboardButtonWebView(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonWebView");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "url", r.readString());
        return obj;
    }

    private static JsonObject readKeyboardButtonUserProfile(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonUserProfile");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "user_id", r.readLong());
        return obj;
    }

    private static JsonObject readInputKeyboardButtonUserProfile(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputKeyboardButtonUserProfile");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "user_id", r.readObject());
        return obj;
    }

    private static JsonObject readKeyboardButtonRequestPoll(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonRequestPoll");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "quiz", r.readBoolean());
        }
        JsonUtils.add(obj, "text", r.readString());
        return obj;
    }

    private static JsonObject readInputKeyboardButtonUrlAuth(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inputKeyboardButtonUrlAuth");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("request_write_access", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "fwd_text", r.readString());
        }
        JsonUtils.add(obj, "url", r.readString());
        JsonUtils.add(obj, "bot", r.readObject());
        return obj;
    }

    private static JsonObject readKeyboardButtonUrlAuth(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonUrlAuth");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "fwd_text", r.readString());
        }
        JsonUtils.add(obj, "url", r.readString());
        JsonUtils.add(obj, "button_id", r.readInt());
        return obj;
    }

    private static JsonObject readKeyboardButtonBuy(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonBuy");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        return obj;
    }

    private static JsonObject readKeyboardButtonGame(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonGame");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        return obj;
    }

    private static JsonObject readKeyboardButtonSwitchInline(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonSwitchInline");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("same_peer", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "query", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "peer_types", r.readVector(TlBinaryReader::readObject));
        }
        return obj;
    }

    private static JsonObject readInlineQueryPeerTypeBotPM(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inlineQueryPeerTypeBotPM");
        return obj;
    }

    private static JsonObject readInlineQueryPeerTypeBroadcast(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inlineQueryPeerTypeBroadcast");
        return obj;
    }

    private static JsonObject readInlineQueryPeerTypeMegagroup(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inlineQueryPeerTypeMegagroup");
        return obj;
    }

    private static JsonObject readInlineQueryPeerTypeChat(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inlineQueryPeerTypeChat");
        return obj;
    }

    private static JsonObject readInlineQueryPeerTypePM(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inlineQueryPeerTypePM");
        return obj;
    }

    private static JsonObject readInlineQueryPeerTypeSameBotPM(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "inlineQueryPeerTypeSameBotPM");
        return obj;
    }

    private static JsonObject readKeyboardButtonRequestGeoLocation(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonRequestGeoLocation");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        return obj;
    }

    private static JsonObject readKeyboardButtonRequestPhone(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonRequestPhone");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        return obj;
    }

    private static JsonObject readKeyboardButtonCallback(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonCallback");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("requires_password", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "data", r.readBytes());
        return obj;
    }

    private static JsonObject readKeyboardButtonUrl(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButtonUrl");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "url", r.readString());
        return obj;
    }

    private static JsonObject readKeyboardButton(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "keyboardButton");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "style", r.readObject());
        }
        JsonUtils.add(obj, "text", r.readString());
        return obj;
    }

    private static JsonObject readReplyKeyboardMarkup(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "replyKeyboardMarkup");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("resize", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("single_use", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("selective", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("persistent", TLObject.hasFlag(flags, TLObject.FLAG_4));
        JsonUtils.add(obj, "rows", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "placeholder", r.readString());
        }
        return obj;
    }

    private static JsonObject readReplyKeyboardForceReply(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "replyKeyboardForceReply");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("single_use", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("selective", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "placeholder", r.readString());
        }
        return obj;
    }

    private static JsonObject readReplyKeyboardHide(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "replyKeyboardHide");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("selective", TLObject.hasFlag(flags, TLObject.FLAG_2));
        return obj;
    }

    private static JsonObject readMessageEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageEmpty");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "peer_id", r.readObject());
        }
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionToggleNoForwards(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionToggleNoForwards");
        JsonUtils.add(obj, "new_value", r.readBoolean());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantJoinByRequest(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantJoinByRequest");
        JsonUtils.add(obj, "invite", r.readObject());
        JsonUtils.add(obj, "approved_by", r.readLong());
        return obj;
    }

    private static JsonObject readChatInvitePublicJoinRequests(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatInvitePublicJoinRequests");
        return obj;
    }

    private static JsonObject readChatInviteExported(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatInviteExported");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("revoked", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("permanent", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("request_needed", TLObject.hasFlag(flags, TLObject.FLAG_6));
        JsonUtils.add(obj, "link", r.readString());
        JsonUtils.add(obj, "admin_id", r.readLong());
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "start_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "expire_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "usage_limit", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "usage", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "requested", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "subscription_expired", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "subscription_pricing", r.readObject());
        }
        return obj;
    }

    private static JsonObject readStarsSubscriptionPricing(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starsSubscriptionPricing");
        JsonUtils.add(obj, "period", r.readInt());
        JsonUtils.add(obj, "amount", r.readLong());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeHistoryTTL(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeHistoryTTL");
        JsonUtils.add(obj, "prev_value", r.readInt());
        JsonUtils.add(obj, "new_value", r.readInt());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantVolume(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantVolume");
        JsonUtils.add(obj, "participant", r.readObject());
        return obj;
    }

    private static JsonObject readGroupCallParticipant(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "groupCallParticipant");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("muted", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("left", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("can_self_unmute", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("just_joined", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("versioned", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("muted_by_you", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("volume_by_admin", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("self", TLObject.hasFlag(flags, TLObject.FLAG_12));
        obj.addProperty("video_joined", TLObject.hasFlag(flags, TLObject.FLAG_15));
        JsonUtils.add(obj, "peer", r.readObject());
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "active_date", r.readInt());
        }
        JsonUtils.add(obj, "source", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "volume", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "about", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "raise_hand_rating", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "video", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "presentation", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            JsonUtils.add(obj, "paid_stars_total", r.readLong());
        }
        return obj;
    }

    private static JsonObject readGroupCallParticipantVideo(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "groupCallParticipantVideo");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("paused", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "endpoint", r.readString());
        JsonUtils.add(obj, "source_groups", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "audio_source", r.readInt());
        }
        return obj;
    }

    private static JsonObject readGroupCallParticipantVideoSourceGroup(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "groupCallParticipantVideoSourceGroup");
        JsonUtils.add(obj, "semantics", r.readString());
        JsonUtils.add(obj, "sources", r.readVector(TlBinaryReader::readInt));
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionExportedInviteEdit(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionExportedInviteEdit");
        JsonUtils.add(obj, "prev_invite", r.readObject());
        JsonUtils.add(obj, "new_invite", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionExportedInviteRevoke(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionExportedInviteRevoke");
        JsonUtils.add(obj, "invite", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionExportedInviteDelete(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionExportedInviteDelete");
        JsonUtils.add(obj, "invite", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantJoinByInvite(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantJoinByInvite");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("via_chatlist", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "invite", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionToggleGroupCallSetting(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionToggleGroupCallSetting");
        JsonUtils.add(obj, "join_muted", r.readBoolean());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantUnmute(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantUnmute");
        JsonUtils.add(obj, "participant", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantMute(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantMute");
        JsonUtils.add(obj, "participant", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionDiscardGroupCall(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionDiscardGroupCall");
        JsonUtils.add(obj, "call", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionStartGroupCall(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionStartGroupCall");
        JsonUtils.add(obj, "call", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionToggleSlowMode(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionToggleSlowMode");
        JsonUtils.add(obj, "prev_value", r.readInt());
        JsonUtils.add(obj, "new_value", r.readInt());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeLocation(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeLocation");
        JsonUtils.add(obj, "prev_value", r.readObject());
        JsonUtils.add(obj, "new_value", r.readObject());
        return obj;
    }

    private static JsonObject readChannelLocation(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelLocation");
        JsonUtils.add(obj, "geo_point", r.readObject());
        JsonUtils.add(obj, "address", r.readString());
        return obj;
    }

    private static JsonObject readChannelLocationEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelLocationEmpty");
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeLinkedChat(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeLinkedChat");
        JsonUtils.add(obj, "prev_value", r.readLong());
        JsonUtils.add(obj, "new_value", r.readLong());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionStopPoll(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionStopPoll");
        JsonUtils.add(obj, "message", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionDefaultBannedRights(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionDefaultBannedRights");
        JsonUtils.add(obj, "prev_banned_rights", r.readObject());
        JsonUtils.add(obj, "new_banned_rights", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionTogglePreHistoryHidden(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionTogglePreHistoryHidden");
        JsonUtils.add(obj, "new_value", r.readBoolean());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeStickerSet(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeStickerSet");
        JsonUtils.add(obj, "prev_stickerset", r.readObject());
        JsonUtils.add(obj, "new_stickerset", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantToggleAdmin(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantToggleAdmin");
        JsonUtils.add(obj, "prev_participant", r.readObject());
        JsonUtils.add(obj, "new_participant", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantToggleBan(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantToggleBan");
        JsonUtils.add(obj, "prev_participant", r.readObject());
        JsonUtils.add(obj, "new_participant", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantInvite(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantInvite");
        JsonUtils.add(obj, "participant", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantLeave(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantLeave");
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantJoin(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionParticipantJoin");
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionDeleteMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionDeleteMessage");
        JsonUtils.add(obj, "message", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionEditMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionEditMessage");
        JsonUtils.add(obj, "prev_message", r.readObject());
        JsonUtils.add(obj, "new_message", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionUpdatePinned(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionUpdatePinned");
        JsonUtils.add(obj, "message", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionToggleSignatures(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionToggleSignatures");
        JsonUtils.add(obj, "new_value", r.readBoolean());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionToggleInvites(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionToggleInvites");
        JsonUtils.add(obj, "new_value", r.readBoolean());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangePhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangePhoto");
        JsonUtils.add(obj, "prev_photo", r.readObject());
        JsonUtils.add(obj, "new_photo", r.readObject());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeUsername(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeUsername");
        JsonUtils.add(obj, "prev_value", r.readString());
        JsonUtils.add(obj, "new_value", r.readString());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeAbout(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeAbout");
        JsonUtils.add(obj, "prev_value", r.readString());
        JsonUtils.add(obj, "new_value", r.readString());
        return obj;
    }

    private static JsonObject readChannelAdminLogEventActionChangeTitle(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelAdminLogEventActionChangeTitle");
        JsonUtils.add(obj, "prev_value", r.readString());
        JsonUtils.add(obj, "new_value", r.readString());
        return obj;
    }

    private static JsonObject readUserFull(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userFull");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("blocked", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("phone_calls_available", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("phone_calls_private", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("can_pin_message", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("has_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_12));
        obj.addProperty("video_calls_available", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("voice_messages_forbidden", TLObject.hasFlag(flags, TLObject.FLAG_20));
        obj.addProperty("translations_disabled", TLObject.hasFlag(flags, TLObject.FLAG_23));
        obj.addProperty("stories_pinned_available", TLObject.hasFlag(flags, TLObject.FLAG_26));
        obj.addProperty("blocked_my_stories_from", TLObject.hasFlag(flags, TLObject.FLAG_27));
        obj.addProperty("wallpaper_overridden", TLObject.hasFlag(flags, TLObject.FLAG_28));
        obj.addProperty("contact_require_premium", TLObject.hasFlag(flags, TLObject.FLAG_29));
        obj.addProperty("read_dates_private", TLObject.hasFlag(flags, TLObject.FLAG_30));
        var flags2 = r.readInt();
        obj.addProperty("flags2", flags2);
        obj.addProperty("sponsored_enabled", TLObject.hasFlag(flags2, TLObject.FLAG_7));
        obj.addProperty("can_view_revenue", TLObject.hasFlag(flags2, TLObject.FLAG_9));
        obj.addProperty("bot_can_manage_emoji_status", TLObject.hasFlag(flags2, TLObject.FLAG_10));
        obj.addProperty("display_gifts_button", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        obj.addProperty("noforwards_my_enabled", TLObject.hasFlag(flags2, TLObject.FLAG_23));
        obj.addProperty("noforwards_peer_enabled", TLObject.hasFlag(flags2, TLObject.FLAG_24));
        obj.addProperty("unofficial_security_risk", TLObject.hasFlag(flags2, TLObject.FLAG_26));
        JsonUtils.add(obj, "id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "about", r.readString());
        }
        JsonUtils.add(obj, "settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_21)) {
            JsonUtils.add(obj, "personal_photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "profile_photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            JsonUtils.add(obj, "fallback_photo", r.readObject());
        }
        JsonUtils.add(obj, "notify_settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "bot_info", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "pinned_msg_id", r.readInt());
        }
        JsonUtils.add(obj, "common_chats_count", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "folder_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "theme", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            JsonUtils.add(obj, "private_forward_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "bot_group_admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "bot_broadcast_admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_24)) {
            JsonUtils.add(obj, "wallpaper", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            JsonUtils.add(obj, "stories", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "business_work_hours", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "business_location", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "business_greeting_message", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "business_away_message", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "business_intro", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "birthday", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "personal_channel_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "personal_channel_message", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "stargifts_count", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "starref_program", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "bot_verification", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "send_paid_messages_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "disallowed_gifts", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "stars_rating", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "stars_my_pending_rating", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "stars_my_pending_rating_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_20)) {
            JsonUtils.add(obj, "main_tab", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_21)) {
            JsonUtils.add(obj, "saved_music", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_22)) {
            JsonUtils.add(obj, "note", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_25)) {
            JsonUtils.add(obj, "bot_manager_id", r.readLong());
        }
        return obj;
    }

    private static JsonObject readProfileTabGifs(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "profileTabGifs");
        return obj;
    }

    private static JsonObject readProfileTabLinks(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "profileTabLinks");
        return obj;
    }

    private static JsonObject readProfileTabVoice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "profileTabVoice");
        return obj;
    }

    private static JsonObject readProfileTabMusic(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "profileTabMusic");
        return obj;
    }

    private static JsonObject readProfileTabFiles(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "profileTabFiles");
        return obj;
    }

    private static JsonObject readProfileTabMedia(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "profileTabMedia");
        return obj;
    }

    private static JsonObject readProfileTabGifts(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "profileTabGifts");
        return obj;
    }

    private static JsonObject readProfileTabPosts(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "profileTabPosts");
        return obj;
    }

    private static JsonObject readStarsRating(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starsRating");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "level", r.readInt());
        JsonUtils.add(obj, "current_level_stars", r.readLong());
        JsonUtils.add(obj, "stars", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "next_level_stars", r.readLong());
        }
        return obj;
    }

    private static JsonObject readDisallowedGiftsSettings(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "disallowedGiftsSettings");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("disallow_unlimited_stargifts", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("disallow_limited_stargifts", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("disallow_unique_stargifts", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("disallow_premium_gifts", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("disallow_stargifts_from_channels", TLObject.hasFlag(flags, TLObject.FLAG_4));
        return obj;
    }

    private static JsonObject readBotVerification(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "botVerification");
        JsonUtils.add(obj, "bot_id", r.readLong());
        JsonUtils.add(obj, "icon", r.readLong());
        JsonUtils.add(obj, "description", r.readString());
        return obj;
    }

    private static JsonObject readStarRefProgram(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "starRefProgram");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "bot_id", r.readLong());
        JsonUtils.add(obj, "commission_permille", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "duration_months", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "end_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "daily_revenue_per_user", r.readObject());
        }
        return obj;
    }

    private static JsonObject readBusinessIntro(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "businessIntro");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "description", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "sticker", r.readObject());
        }
        return obj;
    }

    private static JsonObject readBusinessAwayMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "businessAwayMessage");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("offline_only", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "shortcut_id", r.readInt());
        JsonUtils.add(obj, "schedule", r.readObject());
        JsonUtils.add(obj, "recipients", r.readObject());
        return obj;
    }

    private static JsonObject readBusinessRecipients(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "businessRecipients");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("existing_chats", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("new_chats", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("contacts", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("non_contacts", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("exclude_selected", TLObject.hasFlag(flags, TLObject.FLAG_5));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "users", r.readVector(TlBinaryReader::readLong));
        }
        return obj;
    }

    private static JsonObject readBusinessAwayMessageScheduleCustom(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "businessAwayMessageScheduleCustom");
        JsonUtils.add(obj, "start_date", r.readInt());
        JsonUtils.add(obj, "end_date", r.readInt());
        return obj;
    }

    private static JsonObject readBusinessAwayMessageScheduleOutsideWorkHours(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "businessAwayMessageScheduleOutsideWorkHours");
        return obj;
    }

    private static JsonObject readBusinessAwayMessageScheduleAlways(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "businessAwayMessageScheduleAlways");
        return obj;
    }

    private static JsonObject readBusinessGreetingMessage(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "businessGreetingMessage");
        JsonUtils.add(obj, "shortcut_id", r.readInt());
        JsonUtils.add(obj, "recipients", r.readObject());
        JsonUtils.add(obj, "no_activity_days", r.readInt());
        return obj;
    }

    private static JsonObject readBusinessLocation(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "businessLocation");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "geo_point", r.readObject());
        }
        JsonUtils.add(obj, "address", r.readString());
        return obj;
    }

    private static JsonObject readBusinessWorkHours(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "businessWorkHours");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("open_now", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "timezone_id", r.readString());
        JsonUtils.add(obj, "weekly_open", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readBusinessWeeklyOpen(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "businessWeeklyOpen");
        JsonUtils.add(obj, "start_minute", r.readInt());
        JsonUtils.add(obj, "end_minute", r.readInt());
        return obj;
    }

    private static JsonObject readPeerStories(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "peerStories");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "peer", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "max_read_id", r.readInt());
        }
        JsonUtils.add(obj, "stories", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readBotInfo(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "botInfo");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("has_preview_medias", TLObject.hasFlag(flags, TLObject.FLAG_6));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "user_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "description", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "description_photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "description_document", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "commands", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "menu_button", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "privacy_policy_url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "app_settings", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "verifier_settings", r.readObject());
        }
        return obj;
    }

    private static JsonObject readBotVerifierSettings(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "botVerifierSettings");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("can_modify_custom_description", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "icon", r.readLong());
        JsonUtils.add(obj, "company", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "custom_description", r.readString());
        }
        return obj;
    }

    private static JsonObject readBotAppSettings(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "botAppSettings");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "placeholder_path", r.readBytes());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "background_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "background_dark_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "header_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "header_dark_color", r.readInt());
        }
        return obj;
    }

    private static JsonObject readBotMenuButton(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "botMenuButton");
        JsonUtils.add(obj, "text", r.readString());
        JsonUtils.add(obj, "url", r.readString());
        return obj;
    }

    private static JsonObject readBotMenuButtonCommands(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "botMenuButtonCommands");
        return obj;
    }

    private static JsonObject readBotMenuButtonDefault(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "botMenuButtonDefault");
        return obj;
    }

    private static JsonObject readBotCommand(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "botCommand");
        JsonUtils.add(obj, "command", r.readString());
        JsonUtils.add(obj, "description", r.readString());
        return obj;
    }

    private static JsonObject readPeerSettings(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "peerSettings");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("report_spam", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("add_contact", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("block_contact", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("share_contact", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("need_contacts_exception", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("report_geo", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("autoarchived", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("invite_members", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("request_chat_broadcast", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("business_bot_paused", TLObject.hasFlag(flags, TLObject.FLAG_11));
        obj.addProperty("business_bot_can_reply", TLObject.hasFlag(flags, TLObject.FLAG_12));
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "geo_distance", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "request_chat_title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "request_chat_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "business_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "business_bot_manage_url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "charge_paid_message_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "registration_month", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            JsonUtils.add(obj, "phone_country", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "name_change_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "photo_change_date", r.readInt());
        }
        return obj;
    }

    private static JsonObject readUser(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "user");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("self", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("contact", TLObject.hasFlag(flags, TLObject.FLAG_11));
        obj.addProperty("mutual_contact", TLObject.hasFlag(flags, TLObject.FLAG_12));
        obj.addProperty("deleted", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("bot", TLObject.hasFlag(flags, TLObject.FLAG_14));
        obj.addProperty("bot_chat_history", TLObject.hasFlag(flags, TLObject.FLAG_15));
        obj.addProperty("bot_nochats", TLObject.hasFlag(flags, TLObject.FLAG_16));
        obj.addProperty("verified", TLObject.hasFlag(flags, TLObject.FLAG_17));
        obj.addProperty("restricted", TLObject.hasFlag(flags, TLObject.FLAG_18));
        obj.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_20));
        obj.addProperty("bot_inline_geo", TLObject.hasFlag(flags, TLObject.FLAG_21));
        obj.addProperty("support", TLObject.hasFlag(flags, TLObject.FLAG_23));
        obj.addProperty("scam", TLObject.hasFlag(flags, TLObject.FLAG_24));
        obj.addProperty("apply_min_photo", TLObject.hasFlag(flags, TLObject.FLAG_25));
        obj.addProperty("fake", TLObject.hasFlag(flags, TLObject.FLAG_26));
        obj.addProperty("bot_attach_menu", TLObject.hasFlag(flags, TLObject.FLAG_27));
        obj.addProperty("premium", TLObject.hasFlag(flags, TLObject.FLAG_28));
        obj.addProperty("attach_menu_enabled", TLObject.hasFlag(flags, TLObject.FLAG_29));
        var flags2 = r.readInt();
        obj.addProperty("flags2", flags2);
        obj.addProperty("bot_can_edit", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        obj.addProperty("close_friend", TLObject.hasFlag(flags2, TLObject.FLAG_2));
        obj.addProperty("stories_hidden", TLObject.hasFlag(flags2, TLObject.FLAG_3));
        obj.addProperty("stories_unavailable", TLObject.hasFlag(flags2, TLObject.FLAG_4));
        obj.addProperty("contact_require_premium", TLObject.hasFlag(flags2, TLObject.FLAG_10));
        obj.addProperty("bot_business", TLObject.hasFlag(flags2, TLObject.FLAG_11));
        obj.addProperty("bot_has_main_app", TLObject.hasFlag(flags2, TLObject.FLAG_13));
        obj.addProperty("bot_forum_view", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        obj.addProperty("bot_forum_can_manage_topics", TLObject.hasFlag(flags2, TLObject.FLAG_17));
        obj.addProperty("bot_can_manage_bots", TLObject.hasFlag(flags2, TLObject.FLAG_18));
        obj.addProperty("bot_guestchat", TLObject.hasFlag(flags2, TLObject.FLAG_19));
        obj.addProperty("bot_guard", TLObject.hasFlag(flags2, TLObject.FLAG_20));
        JsonUtils.add(obj, "id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "access_hash", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "first_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "last_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "username", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "phone", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "status", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "bot_info_version", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_19)) {
            JsonUtils.add(obj, "bot_inline_placeholder", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            JsonUtils.add(obj, "lang_code", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            JsonUtils.add(obj, "emoji_status", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "usernames", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "stories_max_id", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "profile_color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "bot_active_users", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "bot_verification_icon", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "send_paid_messages_stars", r.readLong());
        }
        return obj;
    }

    private static JsonObject readUserStatusLastMonth(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userStatusLastMonth");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("by_me", TLObject.hasFlag(flags, TLObject.FLAG_0));
        return obj;
    }

    private static JsonObject readUserStatusLastWeek(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userStatusLastWeek");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("by_me", TLObject.hasFlag(flags, TLObject.FLAG_0));
        return obj;
    }

    private static JsonObject readUserStatusRecently(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userStatusRecently");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("by_me", TLObject.hasFlag(flags, TLObject.FLAG_0));
        return obj;
    }

    private static JsonObject readUserStatusOffline(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userStatusOffline");
        JsonUtils.add(obj, "was_online", r.readInt());
        return obj;
    }

    private static JsonObject readUserStatusOnline(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userStatusOnline");
        JsonUtils.add(obj, "expires", r.readInt());
        return obj;
    }

    private static JsonObject readUserStatusEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userStatusEmpty");
        return obj;
    }

    private static JsonObject readUserProfilePhoto(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userProfilePhoto");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("has_video", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("personal", TLObject.hasFlag(flags, TLObject.FLAG_2));
        JsonUtils.add(obj, "photo_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "stripped_thumb", r.readBytes());
        }
        JsonUtils.add(obj, "dc_id", r.readInt());
        return obj;
    }

    private static JsonObject readUserProfilePhotoEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userProfilePhotoEmpty");
        return obj;
    }

    private static JsonObject readUserEmpty(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userEmpty");
        JsonUtils.add(obj, "id", r.readLong());
        return obj;
    }

    private static JsonObject readChatFull(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatFull");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("can_set_username", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("has_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("translations_disabled", TLObject.hasFlag(flags, TLObject.FLAG_19));
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "about", r.readString());
        JsonUtils.add(obj, "participants", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "chat_photo", r.readObject());
        }
        JsonUtils.add(obj, "notify_settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "exported_invite", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "bot_info", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "pinned_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "folder_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "call", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "groupcall_default_join_as", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            JsonUtils.add(obj, "theme_emoticon", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "requests_pending", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "recent_requesters", r.readVector(TlBinaryReader::readLong));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "available_reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            JsonUtils.add(obj, "reactions_limit", r.readInt());
        }
        return obj;
    }

    private static JsonObject readChatParticipants(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatParticipants");
        JsonUtils.add(obj, "chat_id", r.readLong());
        JsonUtils.add(obj, "participants", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "version", r.readInt());
        return obj;
    }

    private static JsonObject readChatParticipantAdmin(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatParticipantAdmin");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "user_id", r.readLong());
        JsonUtils.add(obj, "inviter_id", r.readLong());
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "rank", r.readString());
        }
        return obj;
    }

    private static JsonObject readChatParticipantCreator(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatParticipantCreator");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "user_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "rank", r.readString());
        }
        return obj;
    }

    private static JsonObject readChatParticipant(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatParticipant");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "user_id", r.readLong());
        JsonUtils.add(obj, "inviter_id", r.readLong());
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "rank", r.readString());
        }
        return obj;
    }

    private static JsonObject readChatParticipantsForbidden(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "chatParticipantsForbidden");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        JsonUtils.add(obj, "chat_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "self_participant", r.readObject());
        }
        return obj;
    }

    private static JsonObject readChannelFull(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelFull");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("can_view_participants", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("can_set_username", TLObject.hasFlag(flags, TLObject.FLAG_6));
        obj.addProperty("can_set_stickers", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("hidden_prehistory", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("can_set_location", TLObject.hasFlag(flags, TLObject.FLAG_16));
        obj.addProperty("has_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_19));
        obj.addProperty("can_view_stats", TLObject.hasFlag(flags, TLObject.FLAG_20));
        obj.addProperty("blocked", TLObject.hasFlag(flags, TLObject.FLAG_22));
        var flags2 = r.readInt();
        obj.addProperty("flags2", flags2);
        obj.addProperty("can_delete_channel", TLObject.hasFlag(flags2, TLObject.FLAG_0));
        obj.addProperty("antispam", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        obj.addProperty("participants_hidden", TLObject.hasFlag(flags2, TLObject.FLAG_2));
        obj.addProperty("translations_disabled", TLObject.hasFlag(flags2, TLObject.FLAG_3));
        obj.addProperty("stories_pinned_available", TLObject.hasFlag(flags2, TLObject.FLAG_5));
        obj.addProperty("view_forum_as_messages", TLObject.hasFlag(flags2, TLObject.FLAG_6));
        obj.addProperty("restricted_sponsored", TLObject.hasFlag(flags2, TLObject.FLAG_11));
        obj.addProperty("can_view_revenue", TLObject.hasFlag(flags2, TLObject.FLAG_12));
        obj.addProperty("paid_media_allowed", TLObject.hasFlag(flags2, TLObject.FLAG_14));
        obj.addProperty("can_view_stars_revenue", TLObject.hasFlag(flags2, TLObject.FLAG_15));
        obj.addProperty("paid_reactions_available", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        obj.addProperty("stargifts_available", TLObject.hasFlag(flags2, TLObject.FLAG_19));
        obj.addProperty("paid_messages_available", TLObject.hasFlag(flags2, TLObject.FLAG_20));
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "about", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "participants_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "admins_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "kicked_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "banned_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "online_count", r.readInt());
        }
        JsonUtils.add(obj, "read_inbox_max_id", r.readInt());
        JsonUtils.add(obj, "read_outbox_max_id", r.readInt());
        JsonUtils.add(obj, "unread_count", r.readInt());
        JsonUtils.add(obj, "chat_photo", r.readObject());
        JsonUtils.add(obj, "notify_settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_23)) {
            JsonUtils.add(obj, "exported_invite", r.readObject());
        }
        JsonUtils.add(obj, "bot_info", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "migrated_from_chat_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "migrated_from_max_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "pinned_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "stickerset", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "available_min_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "folder_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "linked_chat_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "location", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "slowmode_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "slowmode_next_send_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "stats_dc", r.readInt());
        }
        JsonUtils.add(obj, "pts", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_21)) {
            JsonUtils.add(obj, "call", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_24)) {
            JsonUtils.add(obj, "ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            JsonUtils.add(obj, "pending_suggestions", r.readVector(TlBinaryReader::readString));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_26)) {
            JsonUtils.add(obj, "groupcall_default_join_as", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_27)) {
            JsonUtils.add(obj, "theme_emoticon", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            JsonUtils.add(obj, "requests_pending", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            JsonUtils.add(obj, "recent_requesters", r.readVector(TlBinaryReader::readLong));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_29)) {
            JsonUtils.add(obj, "default_send_as", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            JsonUtils.add(obj, "available_reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "reactions_limit", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "stories", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "wallpaper", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "boosts_applied", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "boosts_unrestrict", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "emojiset", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "bot_verification", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "stargifts_count", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_21)) {
            JsonUtils.add(obj, "send_paid_messages_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_22)) {
            JsonUtils.add(obj, "main_tab", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_23)) {
            JsonUtils.add(obj, "guard_bot_id", r.readLong());
        }
        return obj;
    }

    private static JsonObject readStickerSet(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "stickerSet");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("archived", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("official", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("masks", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("emojis", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("text_color", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("channel_emoji_status", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_11));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "installed_date", r.readInt());
        }
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "access_hash", r.readLong());
        JsonUtils.add(obj, "title", r.readString());
        JsonUtils.add(obj, "short_name", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "thumbs", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "thumb_dc_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "thumb_version", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "thumb_document_id", r.readLong());
        }
        JsonUtils.add(obj, "count", r.readInt());
        JsonUtils.add(obj, "hash", r.readInt());
        return obj;
    }

    private static JsonObject readMessages_channelMessages(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messages.channelMessages");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("inexact", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "pts", r.readInt());
        JsonUtils.add(obj, "count", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "offset_id_offset", r.readInt());
        }
        JsonUtils.add(obj, "messages", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "topics", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "chats", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "users", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readMessages_messagesSlice(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messages.messagesSlice");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("inexact", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "count", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "next_rate", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "offset_id_offset", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "search_flood", r.readObject());
        }
        JsonUtils.add(obj, "messages", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "topics", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "chats", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "users", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readSearchPostsFlood(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "searchPostsFlood");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("query_is_free", TLObject.hasFlag(flags, TLObject.FLAG_0));
        JsonUtils.add(obj, "total_daily", r.readInt());
        JsonUtils.add(obj, "remains", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "wait_till", r.readInt());
        }
        JsonUtils.add(obj, "stars_amount", r.readLong());
        return obj;
    }

    private static JsonObject readMessages_messages(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messages.messages");
        JsonUtils.add(obj, "messages", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "topics", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "chats", r.readVector(TlBinaryReader::readObject));
        JsonUtils.add(obj, "users", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readUserFull_layer223(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "userFull");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("blocked", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("phone_calls_available", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("phone_calls_private", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("can_pin_message", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("has_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_12));
        obj.addProperty("video_calls_available", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("voice_messages_forbidden", TLObject.hasFlag(flags, TLObject.FLAG_20));
        obj.addProperty("translations_disabled", TLObject.hasFlag(flags, TLObject.FLAG_23));
        obj.addProperty("stories_pinned_available", TLObject.hasFlag(flags, TLObject.FLAG_26));
        obj.addProperty("blocked_my_stories_from", TLObject.hasFlag(flags, TLObject.FLAG_27));
        obj.addProperty("wallpaper_overridden", TLObject.hasFlag(flags, TLObject.FLAG_28));
        obj.addProperty("contact_require_premium", TLObject.hasFlag(flags, TLObject.FLAG_29));
        obj.addProperty("read_dates_private", TLObject.hasFlag(flags, TLObject.FLAG_30));
        var flags2 = r.readInt();
        obj.addProperty("flags2", flags2);
        obj.addProperty("sponsored_enabled", TLObject.hasFlag(flags2, TLObject.FLAG_7));
        obj.addProperty("can_view_revenue", TLObject.hasFlag(flags2, TLObject.FLAG_9));
        obj.addProperty("bot_can_manage_emoji_status", TLObject.hasFlag(flags2, TLObject.FLAG_10));
        obj.addProperty("display_gifts_button", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        obj.addProperty("noforwards_my_enabled", TLObject.hasFlag(flags2, TLObject.FLAG_23));
        obj.addProperty("noforwards_peer_enabled", TLObject.hasFlag(flags2, TLObject.FLAG_24));
        JsonUtils.add(obj, "id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "about", r.readString());
        }
        JsonUtils.add(obj, "settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_21)) {
            JsonUtils.add(obj, "personal_photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "profile_photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            JsonUtils.add(obj, "fallback_photo", r.readObject());
        }
        JsonUtils.add(obj, "notify_settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "bot_info", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "pinned_msg_id", r.readInt());
        }
        JsonUtils.add(obj, "common_chats_count", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "folder_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "theme", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            JsonUtils.add(obj, "private_forward_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "bot_group_admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "bot_broadcast_admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_24)) {
            JsonUtils.add(obj, "wallpaper", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            JsonUtils.add(obj, "stories", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "business_work_hours", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "business_location", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "business_greeting_message", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "business_away_message", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "business_intro", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "birthday", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "personal_channel_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "personal_channel_message", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "stargifts_count", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "starref_program", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "bot_verification", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "send_paid_messages_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "disallowed_gifts", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "stars_rating", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "stars_my_pending_rating", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "stars_my_pending_rating_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_20)) {
            JsonUtils.add(obj, "main_tab", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_21)) {
            JsonUtils.add(obj, "saved_music", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_22)) {
            JsonUtils.add(obj, "note", r.readObject());
        }
        return obj;
    }

    private static JsonObject readStoryItem_layer223(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "storyItem");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("pinned", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("public", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("close_friends", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("edited", TLObject.hasFlag(flags, TLObject.FLAG_11));
        obj.addProperty("contacts", TLObject.hasFlag(flags, TLObject.FLAG_12));
        obj.addProperty("selected_contacts", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("out", TLObject.hasFlag(flags, TLObject.FLAG_16));
        JsonUtils.add(obj, "id", r.readInt());
        JsonUtils.add(obj, "date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "fwd_from", r.readObject());
        }
        JsonUtils.add(obj, "expire_date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "caption", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "entities", r.readVector(TlBinaryReader::readObject));
        }
        JsonUtils.add(obj, "media", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "media_areas", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "privacy", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "views", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "sent_reaction", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_19)) {
            JsonUtils.add(obj, "albums", r.readVector(TlBinaryReader::readInt));
        }
        return obj;
    }

    private static JsonObject readMessageMediaPoll_layer223(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaPoll");
        JsonUtils.add(obj, "poll", r.readObject());
        JsonUtils.add(obj, "results", r.readObject());
        return obj;
    }

    private static JsonObject readPollResults_layer223(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pollResults");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "results", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "total_voters", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "recent_voters", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "solution", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "solution_entities", r.readVector(TlBinaryReader::readObject));
        }
        return obj;
    }

    private static JsonObject readPollAnswerVoters_layer223(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pollAnswerVoters");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("chosen", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("correct", TLObject.hasFlag(flags, TLObject.FLAG_1));
        JsonUtils.add(obj, "option", r.readBytes());
        JsonUtils.add(obj, "voters", r.readInt());
        return obj;
    }

    private static JsonObject readPoll_layer223(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "poll");
        JsonUtils.add(obj, "id", r.readLong());
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("closed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("public_voters", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("multiple_choice", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("quiz", TLObject.hasFlag(flags, TLObject.FLAG_3));
        JsonUtils.add(obj, "question", r.readObject());
        JsonUtils.add(obj, "answers", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "close_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "close_date", r.readInt());
        }
        return obj;
    }

    private static JsonObject readPollAnswer_layer223(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pollAnswer");
        JsonUtils.add(obj, "text", r.readObject());
        JsonUtils.add(obj, "option", r.readBytes());
        return obj;
    }

    private static JsonObject readMessageMediaPhoto_layer223(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageMediaPhoto");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_3));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "ttl_seconds", r.readInt());
        }
        return obj;
    }

    private static JsonObject readMessageReplyHeader_layer223(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "messageReplyHeader");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("reply_to_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("forum_topic", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("quote", TLObject.hasFlag(flags, TLObject.FLAG_9));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "reply_to_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "reply_to_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "reply_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "reply_media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "reply_to_top_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "quote_text", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "quote_entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "quote_offset", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "todo_item_id", r.readInt());
        }
        return obj;
    }

    private static JsonObject readPoll_layer224(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "poll");
        JsonUtils.add(obj, "id", r.readLong());
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("closed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        obj.addProperty("public_voters", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("multiple_choice", TLObject.hasFlag(flags, TLObject.FLAG_2));
        obj.addProperty("quiz", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("open_answers", TLObject.hasFlag(flags, TLObject.FLAG_6));
        obj.addProperty("revoting_disabled", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("shuffle_answers", TLObject.hasFlag(flags, TLObject.FLAG_8));
        obj.addProperty("hide_results_until_close", TLObject.hasFlag(flags, TLObject.FLAG_9));
        obj.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_10));
        JsonUtils.add(obj, "question", r.readObject());
        JsonUtils.add(obj, "answers", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "close_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "close_date", r.readInt());
        }
        JsonUtils.add(obj, "hash", r.readLong());
        return obj;
    }

    private static JsonObject readMessage_layer224(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "message");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("out", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("mentioned", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("media_unread", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("silent", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("post", TLObject.hasFlag(flags, TLObject.FLAG_14));
        obj.addProperty("from_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_18));
        obj.addProperty("legacy", TLObject.hasFlag(flags, TLObject.FLAG_19));
        obj.addProperty("edit_hide", TLObject.hasFlag(flags, TLObject.FLAG_21));
        obj.addProperty("pinned", TLObject.hasFlag(flags, TLObject.FLAG_24));
        obj.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_26));
        obj.addProperty("invert_media", TLObject.hasFlag(flags, TLObject.FLAG_27));
        var flags2 = r.readInt();
        obj.addProperty("flags2", flags2);
        obj.addProperty("offline", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        obj.addProperty("video_processing_pending", TLObject.hasFlag(flags2, TLObject.FLAG_4));
        obj.addProperty("paid_suggested_post_stars", TLObject.hasFlag(flags2, TLObject.FLAG_8));
        obj.addProperty("paid_suggested_post_ton", TLObject.hasFlag(flags2, TLObject.FLAG_9));
        JsonUtils.add(obj, "id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_29)) {
            JsonUtils.add(obj, "from_boosts_applied", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "from_rank", r.readString());
        }
        JsonUtils.add(obj, "peer_id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            JsonUtils.add(obj, "saved_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "fwd_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "via_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "via_business_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "reply_to", r.readObject());
        }
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "message", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "reply_markup", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "views", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "forwards", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_23)) {
            JsonUtils.add(obj, "replies", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "edit_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            JsonUtils.add(obj, "post_author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "grouped_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            JsonUtils.add(obj, "reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            JsonUtils.add(obj, "restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            JsonUtils.add(obj, "ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            JsonUtils.add(obj, "quick_reply_shortcut_id", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "effect", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "factcheck", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "report_delivery_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "paid_message_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "suggested_post", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "schedule_repeat_period", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "summary_from_language", r.readString());
        }
        return obj;
    }

    private static JsonObject readPageBlockOrderedList_layer225(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageBlockOrderedList");
        JsonUtils.add(obj, "items", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readPageListOrderedItemBlocks_layer225(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageListOrderedItemBlocks");
        JsonUtils.add(obj, "num", r.readString());
        JsonUtils.add(obj, "blocks", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readPageListItemBlocks_layer225(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageListItemBlocks");
        JsonUtils.add(obj, "blocks", r.readVector(TlBinaryReader::readObject));
        return obj;
    }

    private static JsonObject readPageListItemText_layer225(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageListItemText");
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readPageListOrderedItemText_layer225(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "pageListOrderedItemText");
        JsonUtils.add(obj, "num", r.readString());
        JsonUtils.add(obj, "text", r.readObject());
        return obj;
    }

    private static JsonObject readChannelFull_layer225(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "channelFull");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("can_view_participants", TLObject.hasFlag(flags, TLObject.FLAG_3));
        obj.addProperty("can_set_username", TLObject.hasFlag(flags, TLObject.FLAG_6));
        obj.addProperty("can_set_stickers", TLObject.hasFlag(flags, TLObject.FLAG_7));
        obj.addProperty("hidden_prehistory", TLObject.hasFlag(flags, TLObject.FLAG_10));
        obj.addProperty("can_set_location", TLObject.hasFlag(flags, TLObject.FLAG_16));
        obj.addProperty("has_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_19));
        obj.addProperty("can_view_stats", TLObject.hasFlag(flags, TLObject.FLAG_20));
        obj.addProperty("blocked", TLObject.hasFlag(flags, TLObject.FLAG_22));
        var flags2 = r.readInt();
        obj.addProperty("flags2", flags2);
        obj.addProperty("can_delete_channel", TLObject.hasFlag(flags2, TLObject.FLAG_0));
        obj.addProperty("antispam", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        obj.addProperty("participants_hidden", TLObject.hasFlag(flags2, TLObject.FLAG_2));
        obj.addProperty("translations_disabled", TLObject.hasFlag(flags2, TLObject.FLAG_3));
        obj.addProperty("stories_pinned_available", TLObject.hasFlag(flags2, TLObject.FLAG_5));
        obj.addProperty("view_forum_as_messages", TLObject.hasFlag(flags2, TLObject.FLAG_6));
        obj.addProperty("restricted_sponsored", TLObject.hasFlag(flags2, TLObject.FLAG_11));
        obj.addProperty("can_view_revenue", TLObject.hasFlag(flags2, TLObject.FLAG_12));
        obj.addProperty("paid_media_allowed", TLObject.hasFlag(flags2, TLObject.FLAG_14));
        obj.addProperty("can_view_stars_revenue", TLObject.hasFlag(flags2, TLObject.FLAG_15));
        obj.addProperty("paid_reactions_available", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        obj.addProperty("stargifts_available", TLObject.hasFlag(flags2, TLObject.FLAG_19));
        obj.addProperty("paid_messages_available", TLObject.hasFlag(flags2, TLObject.FLAG_20));
        JsonUtils.add(obj, "id", r.readLong());
        JsonUtils.add(obj, "about", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "participants_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            JsonUtils.add(obj, "admins_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "kicked_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "banned_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "online_count", r.readInt());
        }
        JsonUtils.add(obj, "read_inbox_max_id", r.readInt());
        JsonUtils.add(obj, "read_outbox_max_id", r.readInt());
        JsonUtils.add(obj, "unread_count", r.readInt());
        JsonUtils.add(obj, "chat_photo", r.readObject());
        JsonUtils.add(obj, "notify_settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_23)) {
            JsonUtils.add(obj, "exported_invite", r.readObject());
        }
        JsonUtils.add(obj, "bot_info", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "migrated_from_chat_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "migrated_from_max_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "pinned_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "stickerset", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "available_min_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "folder_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            JsonUtils.add(obj, "linked_chat_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "location", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "slowmode_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "slowmode_next_send_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "stats_dc", r.readInt());
        }
        JsonUtils.add(obj, "pts", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_21)) {
            JsonUtils.add(obj, "call", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_24)) {
            JsonUtils.add(obj, "ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            JsonUtils.add(obj, "pending_suggestions", r.readVector(TlBinaryReader::readString));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_26)) {
            JsonUtils.add(obj, "groupcall_default_join_as", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_27)) {
            JsonUtils.add(obj, "theme_emoticon", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            JsonUtils.add(obj, "requests_pending", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            JsonUtils.add(obj, "recent_requesters", r.readVector(TlBinaryReader::readLong));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_29)) {
            JsonUtils.add(obj, "default_send_as", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            JsonUtils.add(obj, "available_reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_13)) {
            JsonUtils.add(obj, "reactions_limit", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_4)) {
            JsonUtils.add(obj, "stories", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "wallpaper", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "boosts_applied", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "boosts_unrestrict", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "emojiset", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "bot_verification", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            JsonUtils.add(obj, "stargifts_count", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_21)) {
            JsonUtils.add(obj, "send_paid_messages_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_22)) {
            JsonUtils.add(obj, "main_tab", r.readObject());
        }
        return obj;
    }

    private static JsonObject readMessage_layer225(TlBinaryReader r) {
        var obj = new JsonObject();
        obj.addProperty("_", "message");
        var flags = r.readInt();
        obj.addProperty("flags", flags);
        obj.addProperty("out", TLObject.hasFlag(flags, TLObject.FLAG_1));
        obj.addProperty("mentioned", TLObject.hasFlag(flags, TLObject.FLAG_4));
        obj.addProperty("media_unread", TLObject.hasFlag(flags, TLObject.FLAG_5));
        obj.addProperty("silent", TLObject.hasFlag(flags, TLObject.FLAG_13));
        obj.addProperty("post", TLObject.hasFlag(flags, TLObject.FLAG_14));
        obj.addProperty("from_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_18));
        obj.addProperty("legacy", TLObject.hasFlag(flags, TLObject.FLAG_19));
        obj.addProperty("edit_hide", TLObject.hasFlag(flags, TLObject.FLAG_21));
        obj.addProperty("pinned", TLObject.hasFlag(flags, TLObject.FLAG_24));
        obj.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_26));
        obj.addProperty("invert_media", TLObject.hasFlag(flags, TLObject.FLAG_27));
        var flags2 = r.readInt();
        obj.addProperty("flags2", flags2);
        obj.addProperty("offline", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        obj.addProperty("video_processing_pending", TLObject.hasFlag(flags2, TLObject.FLAG_4));
        obj.addProperty("paid_suggested_post_stars", TLObject.hasFlag(flags2, TLObject.FLAG_8));
        obj.addProperty("paid_suggested_post_ton", TLObject.hasFlag(flags2, TLObject.FLAG_9));
        JsonUtils.add(obj, "id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            JsonUtils.add(obj, "from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_29)) {
            JsonUtils.add(obj, "from_boosts_applied", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            JsonUtils.add(obj, "from_rank", r.readString());
        }
        JsonUtils.add(obj, "peer_id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            JsonUtils.add(obj, "saved_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "fwd_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "via_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            JsonUtils.add(obj, "via_business_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_19)) {
            JsonUtils.add(obj, "guestchat_via_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "reply_to", r.readObject());
        }
        JsonUtils.add(obj, "date", r.readInt());
        JsonUtils.add(obj, "message", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            JsonUtils.add(obj, "media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "reply_markup", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "views", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "forwards", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_23)) {
            JsonUtils.add(obj, "replies", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            JsonUtils.add(obj, "edit_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            JsonUtils.add(obj, "post_author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            JsonUtils.add(obj, "grouped_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            JsonUtils.add(obj, "reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            JsonUtils.add(obj, "restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            JsonUtils.add(obj, "ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            JsonUtils.add(obj, "quick_reply_shortcut_id", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_2)) {
            JsonUtils.add(obj, "effect", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_3)) {
            JsonUtils.add(obj, "factcheck", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            JsonUtils.add(obj, "report_delivery_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            JsonUtils.add(obj, "paid_message_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            JsonUtils.add(obj, "suggested_post", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            JsonUtils.add(obj, "schedule_repeat_period", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            JsonUtils.add(obj, "summary_from_language", r.readString());
        }
        return obj;
    }

}
