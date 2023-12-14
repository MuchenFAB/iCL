/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2022  huangyuhui <huanghongxun2008@126.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.jackhuang.hmcl.ui.main;

import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.jackhuang.hmcl.Metadata;
import org.jackhuang.hmcl.ui.FXUtils;
import org.jackhuang.hmcl.ui.construct.ComponentList;
import org.jackhuang.hmcl.ui.construct.IconedTwoLineListItem;

import static org.jackhuang.hmcl.util.i18n.I18n.i18n;

public class AboutPage extends StackPane {

    public AboutPage() {
        ComponentList about = new ComponentList();
        {
            IconedTwoLineListItem launcher = new IconedTwoLineListItem();
            launcher.setImage(new Image("/assets/img/craft_table.png"));
            launcher.setTitle("illusion Craft Launcher");
            launcher.setSubtitle(Metadata.VERSION);
            launcher.setExternalLink("https://icl.illusioncraft.cn/");

            IconedTwoLineListItem author = new IconedTwoLineListItem();
            author.setImage(new Image("/assets/img/yellow_fish.png"));
            author.setTitle("huanghongxun");
            author.setSubtitle(i18n("about.author.statement"));
            author.setExternalLink("https://space.bilibili.com/1445341");

            about.getContent().setAll(launcher, author);
        }

        ComponentList thanks = new ComponentList();
        {
            IconedTwoLineListItem illusion = new IconedTwoLineListItem();
            illusion.setImage(new Image("/assets/img/illusion.png"));
            illusion.setTitle("illusion团队");
            illusion.setSubtitle(i18n("about.thanks_to.illusion.statement"));
            illusion.setExternalLink("https://illusioncraft.cn/");

            IconedTwoLineListItem muchen = new IconedTwoLineListItem();
            muchen.setImage(new Image("/assets/img/muchen.png"));
            muchen.setTitle("illusion团队");
            muchen.setSubtitle(i18n("about.thanks_to.muchen.statement"));
            muchen.setExternalLink("https://sbmuchen.shop/");

            IconedTwoLineListItem yushijinhun = new IconedTwoLineListItem();
            yushijinhun.setImage(new Image("/assets/img/yushijinhun.png"));
            yushijinhun.setTitle("yushijinhun");
            yushijinhun.setSubtitle(i18n("about.thanks_to.yushijinhun.statement"));
            yushijinhun.setExternalLink("https://yushi.moe/");

            IconedTwoLineListItem bangbang93 = new IconedTwoLineListItem();
            bangbang93.setImage(new Image("/assets/img/bangbang93.png"));
            bangbang93.setTitle("bangbang93");
            bangbang93.setSubtitle(i18n("about.thanks_to.bangbang93.statement"));
            bangbang93.setExternalLink("https://bmclapi2.bangbang93.com/");
            
            IconedTwoLineListItem glavo = new IconedTwoLineListItem();
            glavo.setImage(new Image("/assets/img/glavo.png"));
            glavo.setTitle("Glavo");
            glavo.setSubtitle(i18n("about.thanks_to.glavo.statement"));
            glavo.setExternalLink("https://github.com/Glavo");
            
            IconedTwoLineListItem gamerteam = new IconedTwoLineListItem();
            gamerteam.setTitle("gamerteam");
            gamerteam.setImage(new Image("/assets/img/gamerteam.png"));
            gamerteam.setSubtitle(i18n("about.thanks_to.gamerteam.statement"));
            gamerteam.setExternalLink("http://www.zhaisoul.com/");


            thanks.getContent().setAll(muchen, yushijinhun, bangbang93, glavo, illusion);
        }

        ComponentList dep = new ComponentList();
        {
            IconedTwoLineListItem javafx = new IconedTwoLineListItem();
            javafx.setTitle("JavaFX");
            javafx.setSubtitle("Copyright © 2013, 2023, Oracle and/or its affiliates.\nLicensed under the GPL 2 with Classpath Exception.");
            javafx.setExternalLink("https://openjfx.io/");

            IconedTwoLineListItem jfoenix = new IconedTwoLineListItem();
            jfoenix.setTitle("JFoenix");
            jfoenix.setSubtitle("Copyright © 2016 JFoenix.\nLicensed under the MIT License.");
            jfoenix.setExternalLink("http://www.jfoenix.com/");

            IconedTwoLineListItem gson = new IconedTwoLineListItem();
            gson.setTitle("Gson");
            gson.setSubtitle("Copyright © 2008 Google Inc.\nLicensed under the Apache 2.0 License.");
            gson.setExternalLink("https://github.com/google/gson");

            IconedTwoLineListItem xz = new IconedTwoLineListItem();
            xz.setTitle("XZ for Java");
            xz.setSubtitle("Lasse Collin, Igor Pavlov, and/or Brett Okken.\nPublic Domain.");
            xz.setExternalLink("https://tukaani.org/xz/java.html");

            IconedTwoLineListItem fxgson = new IconedTwoLineListItem();
            fxgson.setTitle("fx-gson");
            fxgson.setSubtitle("Copyright © 2016 Joffrey Bion.\nLicensed under the MIT License.");
            fxgson.setExternalLink("https://github.com/joffrey-bion/fx-gson");


            IconedTwoLineListItem openNBT = new IconedTwoLineListItem();
            openNBT.setTitle("OpenNBT");
            openNBT.setSubtitle("Copyright © 2013-2021 Steveice10.\nLicensed under the MIT License.");
            openNBT.setExternalLink("https://github.com/Steveice10/OpenNBT");

            IconedTwoLineListItem minecraftJFXSkin = new IconedTwoLineListItem();
            minecraftJFXSkin.setTitle("minecraft-jfx-skin");
            minecraftJFXSkin.setSubtitle("Copyright © 2016 InfinityStudio.\nLicensed under the GPL 3.");
            minecraftJFXSkin.setExternalLink("https://github.com/InfinityStudio/minecraft-jfx-skin");

            dep.getContent().setAll(javafx, jfoenix, gson, xz, fxgson, openNBT, minecraftJFXSkin);
        }

        ComponentList legal = new ComponentList();
        {
            IconedTwoLineListItem copyright = new IconedTwoLineListItem();
            copyright.setTitle(i18n("about.copyright"));
            copyright.setSubtitle(i18n("about.copyright.statement"));
            copyright.setExternalLink("https://icl.illusioncraft.cn/");

            IconedTwoLineListItem claim = new IconedTwoLineListItem();
            claim.setTitle(i18n("about.claim"));
            claim.setSubtitle(i18n("about.claim.statement"));
            claim.setExternalLink("./assets/html/icl_eula.html");

            IconedTwoLineListItem openSource = new IconedTwoLineListItem();
            openSource.setTitle(i18n("about.open_source"));
            openSource.setSubtitle(i18n("about.open_source.statement"));
            openSource.setExternalLink("https://github.com/muchenfab/iCL/");

            legal.getContent().setAll(copyright, claim, openSource);
        }

        VBox content = new VBox(16);
        content.setPadding(new Insets(10));
        content.getChildren().setAll(
                ComponentList.createComponentListTitle(i18n("about")),
                about,

                ComponentList.createComponentListTitle(i18n("about.thanks_to")),
                thanks,

                ComponentList.createComponentListTitle(i18n("about.dependency")),
                dep,

                ComponentList.createComponentListTitle(i18n("about.legal")),
                legal
        );


        ScrollPane scrollPane = new ScrollPane(content);
        scrollPane.setFitToWidth(true);
        FXUtils.smoothScrolling(scrollPane);
        getChildren().setAll(scrollPane);
    }
}
