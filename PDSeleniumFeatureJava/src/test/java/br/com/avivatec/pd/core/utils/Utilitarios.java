package br.com.avivatec.pd.core.utils;

import static br.com.avivatec.pd.core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.avivatec.pd.core.exceptions.UtilsException;
import br.com.avivatec.pd.core.interacao.Interactions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Utilitarios {

	private static final Logger log = LoggerFactory.getLogger(Utilitarios.class.getSimpleName());

	public static String formatter() {
		return DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss").format(LocalDateTime.now());
	}

	

	public void screenshotsCriarFiles() {
//		File fileScreenshot = new File(caminhoScreenshot());
//		fileScreenshot.mkdir();
	}
}
