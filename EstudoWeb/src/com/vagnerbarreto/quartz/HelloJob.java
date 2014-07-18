package com.vagnerbarreto.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.br.vagnerbarreto.controller.LerArquivosController;


public class HelloJob implements Job
{
	public void execute(JobExecutionContext context)
	throws JobExecutionException {
		
		LerArquivosController arquivos = new LerArquivosController();
		arquivos.arquivo();
		
	}
	
}
